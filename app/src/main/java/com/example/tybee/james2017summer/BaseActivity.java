package com.example.tybee.james2017summer;

import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by tybee on 6/14/2017.
 */

public class BaseActivity extends AppCompatActivity {
    public void showToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }

}
