package com.test.Oauth;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;

/*
Aaron Board
 */


public class Github {
    public static JSONObject getUserInfo(String token) {
        try {
            URL url = new URL("https://slack.com/api/users.profile.get?token=" + token);

            BufferedReader reader;
            String jsonStr = "";
            reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
            for (String line; (line = reader.readLine()) != null; ) {
                jsonStr += line;
            }

            return new JSONObject(jsonStr);
        } catch (FileNotFoundException e) {
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getOAuthToken(String code) {

        //TODO always delete before a push
        String clientId = "562161c07d5f44826394";
        String clientSecret = "e64da38348ed61c3d58a4d157175db5c140a6d22";
        String accessToken = "";
        StringBuilder sb = new StringBuilder();
        URLConnection urlConn = null;
        InputStreamReader in = null;
        try {
            URL url = new URL("https://github.com/login/oauth/access_token?client_id=" + clientId + "&client_secret=" + clientSecret + "&code=" + code);
            urlConn = url.openConnection();
            if (urlConn != null)
                urlConn.setReadTimeout(60 * 1000);
            if (urlConn != null && urlConn.getInputStream() != null) {
                in = new InputStreamReader(urlConn.getInputStream(),
                        Charset.defaultCharset());
                BufferedReader reader = new BufferedReader(in);
                for (String line; (line = reader.readLine()) != null; ) {
                    sb.append(line);
                }
            }
            in.close();
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:", e);
        }
        System.out.println(sb);

        accessToken = sb.substring(sb.indexOf("=")
                + 1, sb.indexOf("&"));

        return accessToken;
    }
}
