package com.example.gai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton btn_main_shtraf;
    private ImageButton btn_main_ugon;
    private ImageButton dob_btn;
   private ShtrafFragment shtrafFragment = new ShtrafFragment();
    private UgonFragment ugonFragment = new UgonFragment();
    private InsertFragment insertFragment = new InsertFragment();
    private VivodFragment vivodFragment = new VivodFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        dob_btn = findViewById(R.id.dob_btn);
        btn_main_ugon = findViewById(R.id.button5);
        btn_main_shtraf = findViewById(R.id.button4);

        setNewFragment(shtrafFragment);
        btn_main_shtraf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setNewFragment(shtrafFragment);

            }
        });

        btn_main_ugon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setNewFragment(ugonFragment);

            }
        });
        dob_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setNewFragment(insertFragment);
            }
        });
       
    }

    private void setNewFragment(Fragment fragment) {
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.framelayout, fragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}