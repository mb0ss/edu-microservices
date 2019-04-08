package pl.altkom.edu.mwysokinski.policyservice.api.dto;

import java.io.Serializable;

public class Service implements Serializable {

    private String code;
    private Percent coPayment;
    private Limit limit;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Percent getCoPayment() {
        return coPayment;
    }

    public void setCoPayment(Percent coPayment) {
        this.coPayment = coPayment;
    }

    public Limit getLimit() {
        return limit;
    }

    public void setLimit(Limit limit) {
        this.limit = limit;
    }
}
