package com.example.gai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class Search extends AppCompatActivity {
  private Switch shtraf;
  private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        shtraf = findViewById(R.id.switchsh);
        shtraf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b)
                {
                    BD_GAI bd = new BD_GAI(getApplicationContext());
                   txt.setText(bd.Search("Да").toString());
                      //  txt.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}