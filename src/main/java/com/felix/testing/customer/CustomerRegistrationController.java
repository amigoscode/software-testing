package com.felix.testing.customer;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("api/vi/customer-registration")
public class CustomerRegistrationController {

    @PutMapping
    public void register(@Valid @RequestBody CustomerRegistrationRequest request){

    }
}
