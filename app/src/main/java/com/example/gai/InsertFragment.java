package com.example.gai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class InsertFragment extends Fragment {
    private EditText gos;
    private EditText sts;
    private EditText fio;
    private EditText marka;
    private EditText shtraf;
    private EditText ugon;
    private EditText vin;
    private Button dob;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_insert,container,false);

        gos =   fragment.findViewById(R.id.gos_nomer);
        sts =   fragment.findViewById(R.id.sts);
        fio =   fragment.findViewById(R.id.fio);
        marka = fragment.findViewById(R.id.Marka);
        shtraf =fragment.findViewById(R.id.nal_sh);
        ugon=   fragment.findViewById(R.id.UGON);
        vin =   fragment.findViewById(R.id.Vin);
        dob =   fragment.findViewById(R.id.btn_ts);

        dob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BD_GAI bd = new BD_GAI(getActivity().getApplicationContext());

                try {

                    bd.InsertTable(gos.getText().toString(), sts.getText().toString(), fio.getText().toString(), marka.getText().toString(), shtraf.getText().toString(), ugon.getText().toString(), vin.getText().toString());
                    Toast.makeText(getActivity().getApplicationContext(), "Данные добавлены", Toast.LENGTH_LONG).show();
                }
                catch (Exception ex) {
                    Toast.makeText(getActivity().getApplicationContext(), "Ошибка", Toast.LENGTH_LONG).show();
                }
            }
        });


        return fragment;
    }
}