package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import lombok.Data;

@Data
public class AddressDto {

    private String country;
    private String city;
    private String zipCode;
    private String street;

}
