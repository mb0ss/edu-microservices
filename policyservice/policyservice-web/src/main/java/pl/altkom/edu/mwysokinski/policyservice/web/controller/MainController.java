package pl.altkom.edu.mwysokinski.policyservice.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.altkom.edu.mwysokinski.policyservice.api.event.PolicyVersionCreated;

@RestController
public class MainController {

    @RequestMapping("/")
    public PolicyVersionCreated getPolicy(){
        return new PolicyVersionCreated();
    }
}
