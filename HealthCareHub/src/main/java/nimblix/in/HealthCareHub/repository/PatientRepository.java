package nimblix.in.HealthCareHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import nimblix.in.HealthCareHub.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}