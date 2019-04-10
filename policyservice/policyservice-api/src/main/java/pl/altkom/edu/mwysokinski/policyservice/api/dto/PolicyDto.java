package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import lombok.Data;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Data
public class PolicyDto {

    private String policyNumber;
    private String productCode;
    private PolicyHolderDto policyHolderDto;
    private Date policyValidFrom;
    private Date policyValidTo;
    private Integer versionNumber;
    private Date versionValidFrom;
    private Date versionValidTo;
    private List<CoverDto> covers = new LinkedList<>();

}
