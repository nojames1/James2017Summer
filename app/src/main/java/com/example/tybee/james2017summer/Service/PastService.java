package com.example.tybee.james2017summer.Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by tybee on 7/3/2017.
 */

public class PastService extends Service {

    private Timer timer;
    int update = 0;
    public static final String UPDATE = "update";
    public static final String ACTION = "TestAction";
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String s = intent.getStringExtra("key");
        timer.schedule(new UpdateTask(), 0 , 1000);
        return super.onStartCommand(intent, flags, startId);
    }

private class UpdateTask extends TimerTask{
    public void run(){
        Intent intent = new Intent();
        intent.setAction(ACTION);
        intent.putExtra(UPDATE, ++update);
        sendBroadcast(intent);
    }
}
}
