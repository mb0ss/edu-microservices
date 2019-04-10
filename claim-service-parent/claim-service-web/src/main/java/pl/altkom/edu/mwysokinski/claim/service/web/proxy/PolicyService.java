package pl.altkom.edu.mwysokinski.claim.service.web.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import pl.altkom.edu.mwysokinski.policy.service.api.feign.PolicyFeignClient;

@FeignClient("policy-service")
public interface PolicyService extends PolicyFeignClient {

}
