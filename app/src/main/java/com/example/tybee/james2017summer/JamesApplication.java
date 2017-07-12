package com.example.tybee.james2017summer;

import android.app.Application;


import com.example.tybee.james2017summer.util.UtilLog;

/**
 * Created by tybee on 6/19/2017.
 */

public class JamesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UtilLog.setIsLog(true);
    }


}
