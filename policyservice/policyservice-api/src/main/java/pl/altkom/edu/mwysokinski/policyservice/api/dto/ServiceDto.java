package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import lombok.Data;

@Data
public class ServiceDto {

    private String code;
    private PercentDto coPayment;
    private LimitDto limitDto;

}
