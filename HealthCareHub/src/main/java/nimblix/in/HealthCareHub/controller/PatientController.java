package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import nimblix.in.HealthCareHub.model.Patient;
import nimblix.in.HealthCareHub.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService service;

    // ---------------- ADD PATIENT ----------------
    @PostMapping("/add")
    public Patient addPatient(@RequestBody Patient patient) {
        return service.savePatient(patient);
    }

    // ---------------- GET ALL PATIENTS ----------------
    @GetMapping
    public List<Patient> getAllPatients() {
        return service.getAllPatients();
    }

    // ---------------- SOFT DELETE PATIENT ----------------
    @DeleteMapping("/{id}")
    public String deletePatient(@PathVariable Long id) {
        return service.softDeletePatient(id);
    }
}
