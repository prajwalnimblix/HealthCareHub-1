package nimblix.in.HealthCareHub.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import nimblix.in.HealthCareHub.repository.*;
import nimblix.in.HealthCareHub.response.StatsResponse;

@Service
@RequiredArgsConstructor
public class StatsService {

    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final AppointmentRepository appointmentRepository;

    public StatsResponse getStats() {

        Long totalPatients = patientRepository.count();
        Long totalDoctors = doctorRepository.count();
        Double totalRevenue = appointmentRepository.getTotalRevenue();

        return StatsResponse.builder()
                .totalPatients(totalPatients)
                .totalDoctors(totalDoctors)
                .totalRevenue(totalRevenue)
                .build();
    }
}