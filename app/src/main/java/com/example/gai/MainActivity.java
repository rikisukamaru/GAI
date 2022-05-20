package com.example.gai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private Button btn_main_shtraf;
    private Button btn_main_ugon;
    private Button dob_btn;
    private ImageButton search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dob_btn = findViewById(R.id.dob_btn);
        btn_main_ugon = (Button) findViewById(R.id.button5);
        btn_main_shtraf = (Button) findViewById(R.id.button4);
        search = findViewById(R.id.searchButton);
        btn_main_shtraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityShtraf.class);
                startActivity(intent);
            }
        });

        btn_main_ugon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityUgon.class);
                startActivity(intent);
            }
        });
        dob_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Insert_TS.class);
                startActivity(intent);
            }
        });
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,Search.class);
                startActivity(intent);
            }
        });

    }
}