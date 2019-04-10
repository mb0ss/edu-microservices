package pl.altkom.edu.mwysokinski.policyservice.api.dto;

public class ServiceDto {

    private String code;
    private PercentDto coPayment;
    private LimitDto limitDto;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public PercentDto getCoPayment() {
        return coPayment;
    }

    public void setCoPayment(PercentDto coPayment) {
        this.coPayment = coPayment;
    }

    public LimitDto getLimitDto() {
        return limitDto;
    }

    public void setLimitDto(LimitDto limitDto) {
        this.limitDto = limitDto;
    }

    @Override
    public String toString() {
        return "ServiceDto{" +
                "code='" + code + '\'' +
                ", coPayment=" + coPayment +
                ", limitDto=" + limitDto +
                '}';
    }
}
