package com.example.task_three;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Fireman extends AppCompatActivity implements View.OnClickListener {

//    private static final String TAG = "myLogs";

    Button btn;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fireman_layout);

        Log.d(TAG, "Add View element");

        btn = (Button) findViewById(R.id.main);
        btn.setOnClickListener(this);
        btn = (Button) findViewById(R.id.psychology);
        btn.setOnClickListener(this);
        btn = (Button) findViewById(R.id.civilProtect);
        btn.setOnClickListener(this);

        (findViewById(R.id.logo1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ldubgd.edu.ua/sites/default/files/1_nmz/rozklad/ipb_ekz-zal_41-42.pdf")));
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): Fireman");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): Fireman");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): Fireman");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): Fireman");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): Fireman");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): Fireman");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.civilProtect:
                Intent intent3 = new Intent(this, Civil_Protect.class);
                startActivity(intent3);
                break;
            case R.id.psychology:
                Intent intent2 = new Intent(this, Psychology.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

    }
}