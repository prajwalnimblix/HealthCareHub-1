package nimblix.in.HealthCareHub.response;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@JsonPropertyOrder({
        "totalDoctors",
        "totalPatients",
        "totalRevenue"
})
public class StatsResponse {

    private long totalDoctors;

    private long totalPatients;

    private double totalRevenue;

}