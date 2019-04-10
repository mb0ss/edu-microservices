package pl.altkom.edu.mwysokinski.policyservice.web.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.PolicyDto;

@RestController
@RequestMapping("/rest")
public class PolicyRestController {

    @GetMapping("/policy/{policyNumber}")
    public PolicyDto getPolicyByNumber(@PathVariable("policyNumber") String policyNumber) {
        return new PolicyDto();
    }

    @GetMapping("/policy/{policyNumber}/{date}")
    public PolicyDto getPolicyByNumberAndDate(@PathVariable("policyNumber") String policyNumber,
                                              @PathVariable("date") String date) {
        return new PolicyDto();
    }

    @GetMapping("/test")
    public boolean test() {
        return true;
    }
}
