package com.example.gai;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;



import java.util.ArrayList;
import java.util.List;


public class ShtrafFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View fragment = inflater.inflate(R.layout.fragment_shtraf,container,false);


        EditText nomera =  fragment.findViewById(R.id.nom);
        EditText sts = fragment.findViewById(R.id.st);
        Button btn_rez =  fragment.findViewById(R.id.shtrafbtn);
        TextView rez_sh = fragment.findViewById(R.id.reztxt);
        btn_rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                BD_GAI bd_gai = new BD_GAI(getActivity().getApplicationContext());

                try {
                    rez_sh.setText(bd_gai.Search_SH(nomera.getText().toString(),
                            sts.getText().toString(),
                            "").tooString());
                } catch (NullPointerException ex) {

                    Toast.makeText(getActivity().getApplicationContext(), "Результат не найден", Toast.LENGTH_LONG).show();
                }
            }
        });


        return fragment;



    }

}