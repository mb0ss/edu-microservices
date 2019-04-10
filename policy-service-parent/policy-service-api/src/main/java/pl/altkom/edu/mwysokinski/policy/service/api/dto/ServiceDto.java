package pl.altkom.edu.mwysokinski.policy.service.api.dto;

import lombok.Data;

@Data
public class ServiceDto {

    private String code;
    private PercentDto coPayment;
    private LimitDto limitDto;

}
