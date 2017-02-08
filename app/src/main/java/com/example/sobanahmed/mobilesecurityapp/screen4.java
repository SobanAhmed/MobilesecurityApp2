package com.example.sobanahmed.mobilesecurityapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen4 extends AppCompatActivity {

    private Button btn_Next;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
    }
    public void send_code(View view){
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen5.class),
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
        Intent intent;
        intent=new Intent(screen4.this,screen5.class);
        startActivity(intent);
    }
    public void next(View view){
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen6.class),
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);
        Intent intent;
        intent=new Intent(screen4.this,screen6.class);
        startActivity(intent);
    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen4.class) ,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    @Override
    protected void onPause() {
        super.onStart();
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen4.class) ,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
