package com.example.gai;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ShtrafFragment extends Fragment {
    private Elements_GAI foundElement;
    private TextView gos;
    private TextView Sts;
    private TextView fio;
    private TextView marka;
    private TextView sht;
    private TextView ugn;
    private TextView vin;
    private EditText nomera;
    private EditText sts;
    private Button btn_rez;
    private LinearLayout linearLayout;
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_shtraf,container,false);
        gos = fragment.findViewById(R.id.gss);
        Sts = fragment.findViewById(R.id.textView118);
        fio = fragment.findViewById(R.id.textView1110);
        marka = fragment.findViewById(R.id.textView1112);
        sht = fragment.findViewById(R.id.textView1114);
        ugn = fragment.findViewById(R.id.textView1117);
        vin = fragment.findViewById(R.id.textView1118);
        linearLayout = fragment.findViewById(R.id.contacts);
        linearLayout.setVisibility(View.INVISIBLE);
        nomera =  fragment.findViewById(R.id.nom);
        sts = fragment.findViewById(R.id.st);
        btn_rez =  fragment.findViewById(R.id.shtrafbtn);
        //View outputFrame = fragment.findViewById(R.id.output_frame);

        btn_rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("button", "click");
                BD_GAI bd_gai = new BD_GAI(getActivity().getApplicationContext());

                try {
                    foundElement = bd_gai.Search_SH(nomera.getText().toString(),
                            sts.getText().toString(),
                            "");
                    linearLayout.setVisibility(View.VISIBLE);
                    updateResult(foundElement);

                   // Log.i("data", "data was found");
                } catch (NullPointerException ex) {
                 //   Log.i("data", "data wasn't found");
                    Toast.makeText(getActivity().getApplicationContext(), "Результат не найден", Toast.LENGTH_LONG).show();
                }
            }
        });

        return fragment;
    }
    public void updateResult(Elements_GAI elements_gai) {
        gos.setText(elements_gai.Gos_nomer);
        Sts.setText(elements_gai.FIO);
        fio.setText(elements_gai.STS);
        marka.setText(elements_gai.Marka);
        sht.setText(elements_gai.Shtraf);
        ugn.setText(elements_gai.Ugon);
        vin.setText(elements_gai.VIN);

    }

}