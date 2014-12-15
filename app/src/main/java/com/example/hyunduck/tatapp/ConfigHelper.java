package com.example.hyunduck.tatapp;

import com.parse.ConfigCallback;
import com.parse.ParseConfig;
import com.parse.ParseException;


/**
 * Created by Hyunduck on 12/10/2014.
 */
public class ConfigHelper {
    private ParseConfig config;
    private long configLastFetchedTime;

    public void fetchConfigNeeded()
    {
        final long configRefreshInterval = 60 * 60 * 1000;  // 1hour

        if(config == null ||
                System.currentTimeMillis() - configLastFetchedTime > configRefreshInterval)
        {
            config = ParseConfig.getCurrentConfig();

            // Set the current time, to flag that the operation started and prevent double fetch
            ParseConfig.getInBackground(new ConfigCallback() {
                @Override
                public void done(ParseConfig parseConfig, ParseException e) {
                    if (e == null) {
                        // retrieved successfully
                        config = parseConfig;
                        configLastFetchedTime = System.currentTimeMillis();
                    } else {
                        configLastFetchedTime = 0;
                    }
                }
            });
        }
    }
}
