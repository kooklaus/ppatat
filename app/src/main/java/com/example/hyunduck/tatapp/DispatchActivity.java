package com.example.hyunduck.tatapp;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import com.parse.ParseUser;

public class DispatchActivity extends Activity {

    public DispatchActivity() { }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        // check the current user
        if(ParseUser.getCurrentUser() != null)
        {
            startActivity(new Intent(this, MainActivity.class));
        }
        else
        {
            startActivity(new Intent(this, WelcomeActivity.class));
        }
    }
}
