package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import java.math.BigDecimal;

public class Percent {

    private BigDecimal percent;

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Percent{" +
                "percent=" + percent +
                '}';
    }

}
