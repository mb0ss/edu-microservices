package pl.altkom.edu.mwysokinski.caseservice.web.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import pl.altkom.edu.mwysokinski.policyservice.api.feign.PolicyFeignClient;

@FeignClient("policyservice")
public interface PolicyFeignClientProxy extends PolicyFeignClient {

}