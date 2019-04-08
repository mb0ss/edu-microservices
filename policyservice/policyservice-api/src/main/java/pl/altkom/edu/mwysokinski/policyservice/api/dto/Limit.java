package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import pl.altkom.edu.mwysokinski.policyservice.api.enums.LimitPeriod;

public class Limit {

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

    @Override
    public String toString() {
        return "Limit{" +
                "maxQuantity=" + maxQuantity +
                ", maxAmount=" + maxAmount +
                ", limitPeriod=" + limitPeriod +
                '}';
    }
}
