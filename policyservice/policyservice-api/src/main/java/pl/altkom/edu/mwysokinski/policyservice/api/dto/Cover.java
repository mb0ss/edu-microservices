package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import java.util.List;

public class Cover {

    private String coverCode;
    private List<Service> services;

    public String getCoverCode() {
        return coverCode;
    }

    public void setCoverCode(String coverCode) {
        this.coverCode = coverCode;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public String toString() {
        return "Cover{" +
                "coverCode='" + coverCode + '\'' +
                ", services=" + services +
                '}';
    }
}
