package nimblix.in.HealthCareHub.response;

public class StatsDTO {

    private Long totalPatients;
    private Long totalDoctors;
    private Double totalRevenue;

    public StatsDTO(Long totalPatients, Long totalDoctors, Double totalRevenue) {
        this.totalPatients = totalPatients;
        this.totalDoctors = totalDoctors;
        this.totalRevenue = totalRevenue;
    }

    public Long getTotalPatients() {
        return totalPatients;
    }

    public void setTotalPatients(Long totalPatients) {
        this.totalPatients = totalPatients;
    }

    public Long getTotalDoctors() {
        return totalDoctors;
    }

    public void setTotalDoctors(Long totalDoctors) {
        this.totalDoctors = totalDoctors;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
}