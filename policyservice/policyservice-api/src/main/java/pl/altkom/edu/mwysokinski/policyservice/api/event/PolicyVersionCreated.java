package pl.altkom.edu.mwysokinski.policyservice.api.event;

import pl.altkom.edu.mwysokinski.policyservice.api.dto.Cover;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.PolicyHolder;

import java.util.Date;
import java.util.List;

public class PolicyVersionCreated {

    String policyNumber;
    String productCode;
    PolicyHolder policyHolder;
    Date policyValidFrom;
    Date policyValidTo;
    Integer versionNumber;
    Date versionValidFrom;
    Date versionValidTo;
    List<Cover> covers;

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

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
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

    public List<Cover> getCovers() {
        return covers;
    }

    public void setCovers(List<Cover> covers) {
        this.covers = covers;
    }
}
