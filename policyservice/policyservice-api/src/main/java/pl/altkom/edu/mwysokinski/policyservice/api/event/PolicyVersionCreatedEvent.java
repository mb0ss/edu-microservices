package pl.altkom.edu.mwysokinski.policyservice.api.event;

import lombok.Data;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.CoverDto;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.PolicyHolderDto;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Data
public class PolicyVersionCreatedEvent {

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
