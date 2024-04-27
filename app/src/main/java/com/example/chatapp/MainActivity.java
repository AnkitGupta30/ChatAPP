package com.example.chatapp;
import com.zegocloud.zimkit.services.ZIMKit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initZeroCloud();

        startActivity(new Intent(this, LoginMockActivity.class));
        finish();
    }

    public  void initZeroCloud(){
        ZIMKit.initWith(this.getApplication(),keyConstant.appId,keyConstant.appSign);
        // Online notification for the initialization (use the following code if this is needed).
        ZIMKit.initNotifications();
    }
}