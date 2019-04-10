package pl.altkom.edu.mwysokinski.policy.service.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import pl.altkom.edu.mwysokinski.policy.service.api.dto.PolicyDto;

@FeignClient("policy-service")
public interface PolicyFeignClient {

    @GetMapping("/rest/{policyNumber}")
    PolicyDto getPolicyByNumber(@PathVariable("policyNumber") String policyNumber);

    @GetMapping("/rest/{policyNumber}/{date}")
    PolicyDto getPolicyByNumberAndDate(@PathVariable("policyNumber") String policyNumber, @PathVariable("date") String date);

}
