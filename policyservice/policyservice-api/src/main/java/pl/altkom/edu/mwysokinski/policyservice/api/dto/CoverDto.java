package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import java.util.LinkedList;
import java.util.List;

public class CoverDto {

    private String coverCode;
    private List<ServiceDto> serviceDtos = new LinkedList<>();

    public String getCoverCode() {
        return coverCode;
    }

    public void setCoverCode(String coverCode) {
        this.coverCode = coverCode;
    }

    public List<ServiceDto> getServiceDtos() {
        return serviceDtos;
    }

    public void setServiceDtos(List<ServiceDto> serviceDtos) {
        this.serviceDtos = serviceDtos;
    }

    @Override
    public String toString() {
        return "CoverDto{" +
                "coverCode='" + coverCode + '\'' +
                ", serviceDtos=" + serviceDtos +
                '}';
    }
}
