package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import java.io.Serializable;
import java.util.List;

public class Cover implements Serializable {

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
}
