package pl.altkom.edu.mwysokinski.policyservice.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.edu.mwysokinski.policyservice.api.dto.PolicyDto;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/rest")
public class PolicyRestController {

    @GetMapping("/policy/{policyNumber}")
    public PolicyDto getPolicyByNumber(@PathParam("policyNumber") String policyNumber) {
        return new PolicyDto();
    }

}
