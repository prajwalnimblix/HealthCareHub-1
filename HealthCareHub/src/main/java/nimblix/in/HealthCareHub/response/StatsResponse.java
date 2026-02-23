package nimblix.in.HealthCareHub.response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatsResponse {

    private Long totalPatients;
    private Long totalDoctors;
    private Double totalRevenue;
}