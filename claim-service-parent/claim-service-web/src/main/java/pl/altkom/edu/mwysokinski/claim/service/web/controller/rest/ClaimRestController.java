package pl.altkom.edu.mwysokinski.claim.service.web.controller.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.edu.mwysokinski.claim.service.web.proxy.PolicyService;
import pl.altkom.edu.mwysokinski.policy.service.api.dto.PolicyDto;

@RestController
@RequestMapping("/rest")
public class ClaimRestController {

    private static Logger LOG = LoggerFactory.getLogger(ClaimRestController.class);

    @Autowired
    private PolicyService policyService;

    @HystrixCommand(fallbackMethod = "getPolicyByClaimNumberCircuitBreaker")
    @GetMapping("/{claimNumber}/policy")
    public PolicyDto getPolicyByClaimNumber(@PathVariable("claimNumber") String claimNumber) {
        LOG.info("getPolicyByClaimNumber for " + claimNumber);
        return policyService.getPolicyByNumber(claimNumber);
    }

    public PolicyDto getPolicyByClaimNumberCircuitBreaker(@PathVariable("claimNumber") String claimNumber) {
        LOG.info("getPolicyByClaimNumberCircuitBreaker for " + claimNumber);
        return null;
    }
}
