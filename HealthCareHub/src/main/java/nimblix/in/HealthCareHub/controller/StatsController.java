package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.repository.DoctorRepository;
import nimblix.in.HealthCareHub.repository.PatientRepository;
import nimblix.in.HealthCareHub.repository.TotalRevenueStatsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class StatsController {

    private final DoctorRepository doctorRepository;
    private final PatientRepository patientRepository;
    private final TotalRevenueStatsRepository totalRevenueStatsRepository;

    @GetMapping("/stats")
    public Map<String, Object> getStats() {

        Map<String, Object> response = new HashMap<>();

        response.put("totalDoctors", doctorRepository.count());
        response.put("totalPatients", patientRepository.count());
        response.put("totalRevenue", totalRevenueStatsRepository.getTotalRevenue());

        return response;
    }
}