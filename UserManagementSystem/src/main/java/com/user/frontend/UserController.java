package com.user.frontend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class UserController {
	    @GetMapping("/project")
	    public void start() {
	        new Firstpage();
	        System.out.println("hello");
	    }
}
