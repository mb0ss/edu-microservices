package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import pl.altkom.edu.mwysokinski.policyservice.api.enums.LimitPeriod;

import java.io.Serializable;

public class Limit implements Serializable {

    private Integer maxQuantity;
    private Integer maxAmount;
    private LimitPeriod limitPeriod;

    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    public void setMaxQuantity(Integer maxQuantity) {
        this.maxQuantity = maxQuantity;
    }

    public Integer getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(Integer maxAmount) {
        this.maxAmount = maxAmount;
    }

    public LimitPeriod getLimitPeriod() {
        return limitPeriod;
    }

    public void setLimitPeriod(LimitPeriod limitPeriod) {
        this.limitPeriod = limitPeriod;
    }
}
