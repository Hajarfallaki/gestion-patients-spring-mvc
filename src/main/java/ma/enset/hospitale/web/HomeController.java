package ma.enset.hospitale.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/index"; // Redirige directement vers la liste des patients
    }
}
