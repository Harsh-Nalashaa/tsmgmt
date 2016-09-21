package com.nalashaa.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.nalashaa.ts.service.UserService;

@RestController
public class LoginController {

	@Autowired
    UserService userService; 
}
