package com.example.gai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class UgonFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_ugon,container,false);

        EditText vin = fragment.findViewById(R.id.VINN);
        Button btn_rez =  fragment.findViewById(R.id.btnug);
        TextView rez= fragment.findViewById(R.id.textView5);
        btn_rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BD_GAI bd_gai = new BD_GAI(getActivity().getApplicationContext());

                try {
                    rez.setText(bd_gai.Search_SH("","",vin.getText().toString()).tooString());
                } catch (NullPointerException ex) {

                    Toast.makeText(getActivity().getApplicationContext(), "Результат не найден", Toast.LENGTH_LONG).show();
                }
            }
        });


        return fragment;

    }
}