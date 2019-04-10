package pl.altkom.edu.mwysokinski.policyservice.api.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.PolicyDto;

@FeignClient("policyservice")
public interface PolicyFeignClient {

    @RequestMapping(value = "/rest/policy/{policyNumber}", method = RequestMethod.GET)
    PolicyDto getPolicyByNumber(@PathVariable("policyNumber") String policyNumber);

    @RequestMapping(value = "/rest/policy/{policyNumber}/{date}", method = RequestMethod.GET)
    PolicyDto getPolicyByNumberAndDate(@PathVariable("policyNumber") String policyNumber, @PathVariable("date") String date);

}