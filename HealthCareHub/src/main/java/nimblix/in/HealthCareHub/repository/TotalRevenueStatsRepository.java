package nimblix.in.HealthCareHub.repository;

import nimblix.in.HealthCareHub.config.TotalRevenueStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TotalRevenueStatsRepository extends JpaRepository<TotalRevenueStats, Long> {

    @Query("SELECT COALESCE(SUM(t.revenue), 0) FROM TotalRevenueStats t")
    Double getTotalRevenue();

}