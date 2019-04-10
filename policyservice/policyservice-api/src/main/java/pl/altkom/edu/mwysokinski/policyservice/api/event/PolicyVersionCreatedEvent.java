package pl.altkom.edu.mwysokinski.policyservice.api.event;

import pl.altkom.edu.mwysokinski.policyservice.api.dto.CoverDto;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.PolicyHolderDto;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public PolicyHolderDto getPolicyHolderDto() {
        return policyHolderDto;
    }

    public void setPolicyHolderDto(PolicyHolderDto policyHolderDto) {
        this.policyHolderDto = policyHolderDto;
    }

    public Date getPolicyValidFrom() {
        return policyValidFrom;
    }

    public void setPolicyValidFrom(Date policyValidFrom) {
        this.policyValidFrom = policyValidFrom;
    }

    public Date getPolicyValidTo() {
        return policyValidTo;
    }

    public void setPolicyValidTo(Date policyValidTo) {
        this.policyValidTo = policyValidTo;
    }

    public Integer getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(Integer versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Date getVersionValidFrom() {
        return versionValidFrom;
    }

    public void setVersionValidFrom(Date versionValidFrom) {
        this.versionValidFrom = versionValidFrom;
    }

    public Date getVersionValidTo() {
        return versionValidTo;
    }

    public void setVersionValidTo(Date versionValidTo) {
        this.versionValidTo = versionValidTo;
    }

    public List<CoverDto> getCovers() {
        return covers;
    }

    public void setCovers(List<CoverDto> covers) {
        this.covers = covers;
    }

    @Override
    public String toString() {
        return "PolicyVersionCreatedEvent{" +
                "policyNumber='" + policyNumber + '\'' +
                ", productCode='" + productCode + '\'' +
                ", policyHolderDto=" + policyHolderDto +
                ", policyValidFrom=" + policyValidFrom +
                ", policyValidTo=" + policyValidTo +
                ", versionNumber=" + versionNumber +
                ", versionValidFrom=" + versionValidFrom +
                ", versionValidTo=" + versionValidTo +
                ", covers=" + covers +
                '}';
    }

}
