package com.test.Oauth;

import org.json.JSONObject;

/*
Aaron Board
 */
public interface Oauth {
    public static final int GITHUB_OAUTH = 1;
    public static final int GOOGLE_OAUTH = 2;

    public JSONObject getUserInfo(String token);
    public String getOAuthToken(String code);
}
