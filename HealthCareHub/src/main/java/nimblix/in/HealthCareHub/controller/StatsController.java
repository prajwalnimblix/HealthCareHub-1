package nimblix.in.HealthCareHub.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import nimblix.in.HealthCareHub.response.StatsResponse;
import nimblix.in.HealthCareHub.service.StatsService;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
public class StatsController {

    private final StatsService statsService;

    @GetMapping
    public StatsResponse getStats() {
        return statsService.getStats();
    }
}