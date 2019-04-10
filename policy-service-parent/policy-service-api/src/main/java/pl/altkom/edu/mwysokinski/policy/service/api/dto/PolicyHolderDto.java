package pl.altkom.edu.mwysokinski.policy.service.api.dto;

import lombok.Data;

@Data
public class PolicyHolderDto {

    private String firstName;
    private String lastName;
    private String pesel;
    private String accountNumber;
    private AddressDto addressDto;

}
