package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import pl.altkom.edu.mwysokinski.policyservice.api.enums.LimitPeriod;

public class Limit {
    Integer maxQuantity;
    Integer maxAmount;
    LimitPeriod limitPeriod;
}
