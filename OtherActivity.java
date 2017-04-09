package com.example.forone.activitylifedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

/**
 * Created by ForOne on 17/4/9.
 */

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_activity);
        Log.v("life","OtherActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("life","OtherActivity onStart");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.v("life","OtherActivity onNewIntent");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.v("life","OtherActivity onPostResume");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("life","OtherActivity onResume");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("life","OtherActivity onDestroy");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("life","OtherActivity onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("life","OtherActivity onPause");
    }

    public void startSingleInstanceActivity(View view) {
        Intent intent = new Intent(this, SingleInstanceActivity.class);
        startActivity(intent);
    }
}
