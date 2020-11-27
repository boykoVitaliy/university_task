package com.example.foruniversity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    Button btn;

    private static final String TAG = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.firs_layout);

        Log.d(TAG, "Add View element");

        btn = (Button) findViewById(R.id.fireman);
        btn.setOnClickListener(this);
        btn = (Button) findViewById(R.id.civilProtect);
        btn.setOnClickListener(this);

        btn = (Button) findViewById(R.id.psychology);
        btn.setOnClickListener(this);

        (findViewById(R.id.main)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i(TAG, "Main page");
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ldubgd.edu.ua/kursantustudentu/rozklad")));
            }
        });


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart(): MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart(): MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume(): MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause(): MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop(): MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy(): MainActivity");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.civilProtect:
                Intent intent = new Intent(this, Civil_Protect.class);
                startActivity(intent);
                break;
            case R.id.fireman:
                Intent intent2 = new Intent(this, Fireman.class);
                startActivity(intent2);
                break;
            case R.id.psychology:
                Intent intent3 = new Intent(this, Psychology.class);
                startActivity(intent3);
                break;
            default:
                break;
        }

    }

}