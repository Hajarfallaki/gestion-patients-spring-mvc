package ma.enset.hospitale.web;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import ma.enset.hospitale.entities.Patient;
import ma.enset.hospitale.repository.PatientRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@AllArgsConstructor // Injecte automatiquement le repository
public class PatientController {

    private final PatientRepository patientRepository;

    @GetMapping("/index")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "0") int page,
                        @RequestParam(name = "size", defaultValue = "4") int size,
                        @RequestParam(name = "keyword", defaultValue = "") String kw) {

        // Récupérer la page des patients en fonction du mot-clé (kw) et de la pagination
        Page<Patient> pagePatients = patientRepository.findByNomContains(kw, PageRequest.of(page, size));

        // Ajouter les attributs au modèle pour la vue
        model.addAttribute("listPatients", pagePatients.getContent()); // Liste des patients de la page actuelle
        model.addAttribute("pages", new int[pagePatients.getTotalPages()]); // Nombre total de pages
        model.addAttribute("currentPage", page); // Page actuelle
        model.addAttribute("size", size); // Taille de la page
        model.addAttribute("keyword", kw); // Mot-clé de recherche

        return "patients"; // Retourne la vue "patients.html"
    }

    @GetMapping("/delete")
    public String delete(@RequestParam long id, @RequestParam String keyword, @RequestParam int page) {
        patientRepository.deleteById(id);
        return "redirect:/index?page=" + page + "&keyword=" + keyword;
    }

    @GetMapping("/formPatients")
    public String formPatient(Model model) {
        model.addAttribute("patient", new Patient());
        return "formPatients";
    }

    @PostMapping(path = "/save")
    public String save(@Valid Patient patient, BindingResult bindingResult,
                       @RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "") String keyword) {
        if (bindingResult.hasErrors()) {
            return "formPatients";
        }
        patientRepository.save(patient);
        return "redirect:/index?page="+page+"&keyword="+keyword;
    }

    @GetMapping("/editPatients")
    public String editPatient(Model model, @RequestParam Long id, String keyword, int page) {
        Patient patient = patientRepository.findById(id).orElse(null);

        if (patient == null) {
            throw new RuntimeException("Patient introuvable");
        }

        model.addAttribute("patient", patient);
        model.addAttribute("page", page);
        model.addAttribute("keyword", keyword);
        return "editPatients";
    }
}
