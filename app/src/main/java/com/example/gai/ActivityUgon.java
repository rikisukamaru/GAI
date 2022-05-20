package com.example.gai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityUgon extends AppCompatActivity {
 private Button button_rez_ugon;
  private EditText textView_ugon;
  private TextView rez;
    EditText nomera;
    EditText sts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ugon);
        button_rez_ugon = findViewById(R.id.button);
        textView_ugon= findViewById(R.id.TextVin);
        rez = findViewById(R.id.textView4488);
        nomera =(EditText) findViewById(R.id.nomera);
        sts = findViewById(R.id.sts);

        button_rez_ugon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                BD_GAI bd_gai = new BD_GAI(getApplicationContext());
               // try {
                    rez.setText(bd_gai.Search_SH("","",textView_ugon.getText().toString()).tooString());
           //     } catch (NullPointerException ex) {

              //      rez.setText("Результата не найдено");
                }
         //   }

        });
    }
}