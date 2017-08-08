package com.test.controller;

import com.test.Oauth.Github;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Hello World");

    }

    @RequestMapping("/dontLook")
    public String dontLook(){
        return "dontLook";
    }


    @RequestMapping("/homePage")

    public ModelAndView home(@RequestParam("tempCode") String code) {
        String authToken = Github.getOAuthToken(code);
        System.out.println(authToken);
        return new
                ModelAndView("homePage","message","Hello World");

    }

}
