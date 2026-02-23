package nimblix.in.HealthCareHub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import nimblix.in.HealthCareHub.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    @Query("SELECT COALESCE(SUM(a.consultationFee), 0) FROM Appointment a WHERE a.status = 'COMPLETED'")
    Double getTotalRevenue();
}