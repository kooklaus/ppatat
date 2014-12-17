package com.example.hyunduck.tatapp;

import com.parse.ParseClassName;
import com.parse.ParseUser;
/**
 * Created by Hyunduck on 12/14/2014.
 */

@ParseClassName("tatappUser")
public class TatapUser extends ParseUser{
    public void setPhoneNumber(String phoneNumber)
    {
        put("phoneNumber", phoneNumber);
    }

    public String getPhoneNumber()
    {
        return getString("phoneNumber");
    }
}
