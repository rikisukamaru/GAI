package com.example.gai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Insert_TS extends AppCompatActivity {
private EditText gos;
private EditText sts;
private EditText fio;
private EditText marka;
private EditText shtraf;
private EditText ugon;
private EditText vin;
private Button dob;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_ts);
        gos = findViewById(R.id.gos_nomer);
        sts = findViewById(R.id.sts);
        fio = findViewById(R.id.fio);
        marka = findViewById(R.id.Marka);
        shtraf = findViewById(R.id.nal_sh);
        ugon= findViewById(R.id.UGON);
        vin = findViewById(R.id.Vin);
        dob = findViewById(R.id.btn_ts);

        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BD_GAI bd = new BD_GAI(getApplicationContext());

                try {

                    bd.InsertTable(gos.getText().toString(), sts.getText().toString(), fio.getText().toString(), marka.getText().toString(), shtraf.getText().toString(), ugon.getText().toString(), vin.getText().toString());
                    Toast.makeText(getApplicationContext(), "Данные добавлены", Toast.LENGTH_LONG).show();
                }
                catch (Exception ex) {
                    Toast.makeText(getApplicationContext(), "Ошибка", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}