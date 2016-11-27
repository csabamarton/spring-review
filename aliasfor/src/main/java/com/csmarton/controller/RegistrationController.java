package com.csmarton.controller;

import com.csmarton.annotations.PostJson;
import com.csmarton.model.EmailRequest;
import com.csmarton.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Map;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @RequestMapping(path = "/register",
                    method = RequestMethod.POST,
                    consumes = MediaType.APPLICATION_JSON_VALUE,
                    produces = MediaType.APPLICATION_JSON_VALUE
    )
    @ResponseStatus(HttpStatus.CREATED)
    public Map register(@RequestBody @Valid EmailRequest emailRequest) {
        return registrationService.register(emailRequest);
    }

    @PostJson(path = "/register")
    public Map registerWithAliasFor(@RequestBody @Valid EmailRequest emailRequest) {
        return registrationService.register(emailRequest);
    }

}
