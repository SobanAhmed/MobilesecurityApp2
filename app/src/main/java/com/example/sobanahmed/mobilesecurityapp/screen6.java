package com.example.sobanahmed.mobilesecurityapp;

import android.app.ProgressDialog;
import android.app.ListActivity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class screen6 extends AppCompatActivity{

    private PackageManager packageManager = null;
    private List<ApplicationInfo> applist = null;
    private ApplicationAdapter listadaptor = null;
    private Button btn_Next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen6);

        packageManager = getPackageManager();
//        new LoadApplications().execute();

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







//
//    @Override
//    protected void onListItemClick(ListView l, View v, int position, long id) {
//        super.onListItemClick(l, v, position, id);
//
//        ApplicationInfo app = applist.get(position);
//        try {
//            Intent intent = packageManager
//                    .getLaunchIntentForPackage(app.packageName);
//
//            if (null != intent) {
//                startActivity(intent);
//            }
//        } catch (ActivityNotFoundException e) {
//            Toast.makeText(screen6.this, e.getMessage(),
//                    Toast.LENGTH_LONG).show();
//        } catch (Exception e) {
//            Toast.makeText(screen6.this, e.getMessage(),
//                    Toast.LENGTH_LONG).show();
//        }
//    }

//    private List<ApplicationInfo> checkForLaunchIntent(List<ApplicationInfo> list) {
//        ArrayList<ApplicationInfo> applist = new ArrayList<ApplicationInfo>();
//        for (ApplicationInfo info : list) {
//            try {
//                if (null != packageManager.getLaunchIntentForPackage(info.packageName)) {
//                    applist.add(info);
//                }
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//
//        return applist;
//    }
//
//    private class LoadApplications extends AsyncTask<Void, Void, Void> {
//        private ProgressDialog progress = null;
//
//        @Override
//        protected Void doInBackground(Void... params) {
//            applist = checkForLaunchIntent(packageManager.getInstalledApplications(PackageManager.GET_META_DATA));
//            listadaptor = new ApplicationAdapter(screen6.this,
//                    R.layout.snippet_list_row, applist);
//
//            return null;
//        }
//
//        @Override
//        protected void onCancelled() {
//            super.onCancelled();
//        }
//
//        @Override
//        protected void onPostExecute(Void result) {
//            setListAdapter(listadaptor);
//            progress.dismiss();
//            super.onPostExecute(result);
//        }
//
//        @Override
//        protected void onPreExecute() {
//            progress = ProgressDialog.show(screen6.this, null,
//                    "Loading application info...");
//            super.onPreExecute();
//        }
//
//        @Override
//        protected void onProgressUpdate(Void... values) {
//            super.onProgressUpdate(values);
//        }
//    }
}