package com.example.atomicinteger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mhosein Abbasi, 12/10/2021
 */

@RestController
@RequestMapping("user")
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("generate-person-code")
    public String generatePersonCode(){
        return service.generatePersonCode();
    }

}
