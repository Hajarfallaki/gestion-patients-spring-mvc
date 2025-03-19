package ma.enset.hospitale.repository;

import ma.enset.hospitale.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
