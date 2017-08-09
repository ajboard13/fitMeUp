package com.test.controller;

import com.test.Oauth.Github;
import com.test.Oauth.Oauth;
import com.test.factories.OathFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    private Oauth oauth = OathFactory.getInstance(Oauth.GITHUB_OAUTH);

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Welcome to FitMeUp!");

    }

    @RequestMapping("/dontLook")
    public String dontLook(){
        return "dontLook";
    }


    @RequestMapping("/homePage")

    public ModelAndView home(@RequestParam("tempCode") String code) {
        String authToken = oauth.getOAuthToken(code);
        System.out.println(authToken);
        return new
                ModelAndView("homePage","message","Hello World");

    }

}
