package com.example.task_three;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Civil_Protect extends AppCompatActivity implements View.OnClickListener {

    Button btn;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civil_protect);

        btn = (Button) findViewById(R.id.main);
        btn.setOnClickListener(this);
        btn = (Button) findViewById(R.id.fireman);
        btn.setOnClickListener(this);
        btn = (Button) findViewById(R.id.psychology);
        btn.setOnClickListener(this);

        (findViewById(R.id.logo1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG, "Main page");

                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ldubgd.edu.ua/sites/default/files/1_nmz/rozklad/ipb_ekz-zal_41-42.pdf")));
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): Civil_Protect");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): Civil_Protect");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): Civil_Protect");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): Civil_Protect");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): Civil_Protect");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): Civil_Protect");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main:
                Log.i(TAG, "Open MainActivity");
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.psychology:
                Log.i(TAG, "Open Psychology");
                Intent intent3 = new Intent(this, Psychology.class);
                startActivity(intent3);
                break;
            case R.id.fireman:
                Log.i(TAG, "Fireman");
                Intent intent2 = new Intent(this, Fireman.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

    }
}