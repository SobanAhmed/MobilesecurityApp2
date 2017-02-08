package com.example.sobanahmed.mobilesecurityapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class screen6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);

        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen7.class) ,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
    }
    public void next(View view){
        Intent intent;
        intent=new Intent(screen6.this,screen7.class);
        startActivity(intent);
        finish();
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen6.class) ,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

}