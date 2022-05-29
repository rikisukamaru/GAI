package com.example.gai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class UgonFragment extends Fragment {
    private Elements_GAI foundElement;
    private TextView gos;
    private TextView Sts;
    private TextView fio;
    private TextView marka;
    private TextView sht;
    private TextView ugn;
    private TextView Vin;
    private LinearLayout linearLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_ugon,container,false);
        gos = fragment.findViewById(R.id.gss);
        Sts = fragment.findViewById(R.id.textView118);
        fio = fragment.findViewById(R.id.textView1110);
        marka = fragment.findViewById(R.id.textView1112);
        sht = fragment.findViewById(R.id.textView1114);
        ugn = fragment.findViewById(R.id.textView1117);
        Vin = fragment.findViewById(R.id.textView1118);
        linearLayout = fragment.findViewById(R.id.contacts);
        linearLayout.setVisibility(View.INVISIBLE);
        EditText vin = fragment.findViewById(R.id.VINN);
        Button btn_rez =  fragment.findViewById(R.id.btnug);

        btn_rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BD_GAI bd_gai = new BD_GAI(getActivity().getApplicationContext());

                try {
                    foundElement = bd_gai.Search_SH("","",vin.getText().toString());
                    linearLayout.setVisibility(View.VISIBLE);
                    UUpdateResult(foundElement);
                } catch (NullPointerException ex) {

                    Toast.makeText(getActivity().getApplicationContext(), "Результат не найден", Toast.LENGTH_LONG).show();
                }
            }
        });


        return fragment;

    }
    public void UUpdateResult(Elements_GAI elements_gai) {
        gos.setText(elements_gai.Gos_nomer);
        Sts.setText(elements_gai.FIO);
        fio.setText(elements_gai.STS);
        marka.setText(elements_gai.Marka);
        sht.setText(elements_gai.Shtraf);
        ugn.setText(elements_gai.Ugon);
        Vin.setText(elements_gai.VIN);

    }
}