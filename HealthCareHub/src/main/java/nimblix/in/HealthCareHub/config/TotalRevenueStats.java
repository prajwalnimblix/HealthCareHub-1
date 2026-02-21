package nimblix.in.HealthCareHub.config;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "total_revenue_stats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TotalRevenueStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double revenue;

}