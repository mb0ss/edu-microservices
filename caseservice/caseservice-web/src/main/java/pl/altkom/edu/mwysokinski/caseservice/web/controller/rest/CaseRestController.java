package pl.altkom.edu.mwysokinski.caseservice.web.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.edu.mwysokinski.caseservice.web.proxy.PolicyFeignClientProxy;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.PolicyDto;

@RestController
@RequestMapping("/rest")
public class CaseRestController {

    private static Logger LOG = LoggerFactory.getLogger(CaseRestController.class);

    @Autowired
    private PolicyFeignClientProxy policyFeignClientProxy;

    @GetMapping("/case/{caseNumber}/policy")
    public PolicyDto getPolicyByCaseNumber(@PathVariable("caseNumber") String caseNumber) {
        LOG.info("getPolicyByCaseNumber for " + caseNumber);
        return policyFeignClientProxy.getPolicyByNumber(caseNumber);
    }

}
