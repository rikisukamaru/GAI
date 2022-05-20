package com.example.gai;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class ActivityShtraf extends AppCompatActivity {
    EditText nomera;
    EditText sts;
    Button btn_rez;
    TextView rez_sh;
    EditText textVin;
    TextView txtSH;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shtraf);

        nomera =(EditText) findViewById(R.id.nomera);
        sts = findViewById(R.id.sts);
        txtSH = findViewById(R.id.txtSHTRAF);
        rez_sh = findViewById(R.id.rezultat_shtraf);
        btn_rez = (Button) findViewById(R.id.shtraf_proverka);
        textVin = findViewById(R.id.TextVin);
        btn_rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BD_GAI bd_gai = new BD_GAI(getApplicationContext());
                try {
                    rez_sh.setText(bd_gai.Search_SH(nomera.getText().toString(), sts.getText().toString(),"").tooString());
                  txtSH.setText(bd_gai.Search_SH(nomera.getText().toString(), sts.getText().toString(),"").tooString1());
                } catch (NullPointerException ex) {

                    Toast.makeText(getApplicationContext(), "Результат не найден", Toast.LENGTH_LONG).show();
                }
            }

        });


    }
}
