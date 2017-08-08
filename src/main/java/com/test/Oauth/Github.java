package com.test.Oauth;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by user on 8/8/2017.
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

    public static String getOAuthToken(String code){

        //TODO always delete before a push
        String clientId = "562161c07d5f44826394";
        String clientSecret = "e64da38348ed61c3d58a4d157175db5c140a6d22";
        String accessToken = "";
        try {
            URL url = new URL("https://github.com/login/oauth/access_token?client_id="+clientId+"&client_secret="+clientSecret+"&code="+code);
            HttpURLConnection con = (HttpURLConnection)(url.openConnection());
            con.setInstanceFollowRedirects( false );
            con.connect();
            int responseCode = con.getResponseCode();
            System.out.println( responseCode );
            accessToken = con.getHeaderField("access_token");
            System.out.println( accessToken );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return accessToken;
    }
}
