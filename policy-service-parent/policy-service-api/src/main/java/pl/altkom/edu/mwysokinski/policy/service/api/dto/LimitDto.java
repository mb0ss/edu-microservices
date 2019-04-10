package pl.altkom.edu.mwysokinski.policy.service.api.dto;

import lombok.Data;
import pl.altkom.edu.mwysokinski.policy.service.api.enums.LimitPeriod;

@Data
public class LimitDto {

    private Integer maxQuantity;
    private Integer maxAmount;
    private LimitPeriod limitPeriod;

}
