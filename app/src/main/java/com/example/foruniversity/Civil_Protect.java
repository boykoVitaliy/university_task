package com.example.foruniversity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Civil_Protect extends AppCompatActivity implements View.OnClickListener {

    Button btn;

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
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://ldubgd.edu.ua/sites/default/files/1_nmz/rozklad/ipb_ekz-zal_41-42.pdf")));
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.main:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.psychology:
                Intent intent3 = new Intent(this, Psychology.class);
                startActivity(intent3);
                break;
            case R.id.fireman:
                Intent intent2 = new Intent(this, Fireman.class);
                startActivity(intent2);
                break;
            default:
                break;
        }

    }
}