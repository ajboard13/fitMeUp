package com.test.factories;

import com.test.Oauth.Github;
import com.test.Oauth.Oauth;

/*
Aaron Board
 */
public class OathFactory {
    public static Oauth getInstance(int choice){
        switch (choice){
            case Oauth.GITHUB_OAUTH:
                return new Github();
            default:
                return null;
        }
    }
}
