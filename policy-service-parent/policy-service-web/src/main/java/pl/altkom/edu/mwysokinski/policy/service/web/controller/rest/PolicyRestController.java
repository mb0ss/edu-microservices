package pl.altkom.edu.mwysokinski.policy.service.web.controller.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.edu.mwysokinski.policy.service.api.dto.PolicyDto;

@RestController
@RequestMapping("/rest")
public class PolicyRestController {

    private static Logger LOG = LoggerFactory.getLogger(PolicyRestController.class);

    @GetMapping("/{policyNumber}")
    public PolicyDto getPolicyByNumber(@PathVariable("policyNumber") String policyNumber) {
        LOG.info("getPolicyByNumber for " + policyNumber);
        return new PolicyDto();
    }

    @GetMapping("/{policyNumber}/{date}")
    public PolicyDto getPolicyByNumberAndDate(@PathVariable("policyNumber") String policyNumber,
                                              @PathVariable("date") String date) {
        LOG.info("getPolicyByNumberAndDate for " + policyNumber + " and " + date);
        return new PolicyDto();
    }

}
