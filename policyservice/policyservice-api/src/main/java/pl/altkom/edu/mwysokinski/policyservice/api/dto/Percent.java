package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import java.io.Serializable;
import java.math.BigDecimal;

public class Percent implements Serializable {

    private BigDecimal percent;

    public BigDecimal getPercent() {
        return percent;
    }

    public void setPercent(BigDecimal percent) {
        this.percent = percent;
    }

}
