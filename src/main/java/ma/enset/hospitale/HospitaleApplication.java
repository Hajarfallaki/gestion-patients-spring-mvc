package ma.enset.hospitale;

import ma.enset.hospitale.entities.Patient;
import ma.enset.hospitale.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HospitaleApplication  implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository;



    @Override
    public void run(String... args) throws Exception {

        //Premiére solution
        Patient patient =new Patient();
        patient.setId(null);
        patient.setNom("Hajar");
        patient.setDateNaissance(new Date());
        patient.setMalade(false);
        patient.setScore(100);
        patientRepository.save(patient);  // Sauvegarder ce patient

        //Deuxiéme solution
        Patient patient1 =new Patient(null,"Anas",new Date(),false,100);

        //Troisiéme  solution (pattern Builder)

        Patient patient2 = Patient.builder()
                .nom("Amir")
                .dateNaissance(new Date())
                .score(100)
                .malade(false)
                .build();
        patientRepository.save(patient1);

  patientRepository.save(new Patient(null,"Lina",new Date(),false,100));



    }

    public static void main(String[] args) {
        SpringApplication.run(HospitaleApplication.class, args);
    }

}
