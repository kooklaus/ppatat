package com.example.hyunduck.tatapp;

import android.content.SharedPreferences;
import android.content.Context;

import com.parse.Parse;
import com.parse.ParseObject;


/**
 * Created by Hyunduck on 12/9/2014.
 */
public class Application extends android.app.Application{
    private static SharedPreferences preferences;
    private static ConfigHelper configHelper;

    public Application(){    }

    public void onCreate(){
        super.onCreate();

        Parse.initialize(this, "CrCxATKAAZ5B2b8iEqwPQzIV73HvHQORjEYErRHn",
                "7FcGe956dRWKQ7QikN7f3n89MIE9EVmR4nyA28mg");

        preferences = getSharedPreferences("com.example.hyunduck.tatapp", Context.MODE_PRIVATE);

        configHelper = new ConfigHelper();
        configHelper.fetchConfigNeeded();
    }

    public static ConfigHelper getConfigHelper()
    {
        return configHelper;
    }

}
