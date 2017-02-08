package com.example.sobanahmed.mobilesecurityapp;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class screen2 extends AppCompatActivity {

    private Button btn_Next;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen3.class) ,
                PackageManager.COMPONENT_ENABLED_STATE_ENABLED, PackageManager.DONT_KILL_APP);

        btn_Next= (Button) findViewById(R.id.Nextbutton2);
        btn_Next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent;

                intent=new Intent(screen2.this,screen3.class);
                startActivity(intent);
                finish();
            }
        });

    }
        @Override
    protected void onPostResume() {
        super.onPostResume();
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen2.class) ,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }

    @Override
    protected void onPause() {
        super.onStart();
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, screen2.class) ,
                PackageManager.COMPONENT_ENABLED_STATE_DISABLED, PackageManager.DONT_KILL_APP);
    }
}
