package pl.altkom.edu.mwysokinski.policy.service.api.dto;

import lombok.Data;

@Data
public class AddressDto {

    private String country;
    private String city;
    private String zipCode;
    private String street;

}
