package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import java.math.BigDecimal;

public class PercentDto {

    private BigDecimal percent;

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "PercentDto{" +
                "percent=" + percent +
                '}';
    }

}
