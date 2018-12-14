package com.qyj.qyjcloud.qyjcloudauth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @author shitl
 */
@RestController
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        return principal;
    }
}