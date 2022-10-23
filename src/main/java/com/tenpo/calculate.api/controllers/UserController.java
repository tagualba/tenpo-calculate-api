package com.tenpo.calculate.api.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.tenpo.calculate.api.exceptions.ControllerHandlerException;
import com.tenpo.calculate.api.exceptions.ValidationException;
import com.tenpo.calculate.api.models.dtos.UserRequestDto;
import com.tenpo.calculate.api.models.dtos.UserResponseDto;
import com.tenpo.calculate.api.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/tenpo/user")
@RestController
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(ControllerHandlerException.class);
    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponseDto createUser(@RequestBody UserRequestDto request)
            throws ValidationException, JsonProcessingException {
        return userService.createUser(request);
    }

    @PostMapping("/login")
    public UserResponseDto login(@RequestBody UserRequestDto request)
            throws ValidationException, JsonProcessingException {
        return userService.login(request);
    }
}