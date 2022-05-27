package com.example.gai;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class ShtrafFragment extends Fragment {

    private VivodFragment vivodFragment = new VivodFragment();
    private Elements_GAI foundElement;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_shtraf,container,false);

        EditText nomera =  fragment.findViewById(R.id.nom);
        EditText sts = fragment.findViewById(R.id.st);
        Button btn_rez =  fragment.findViewById(R.id.shtrafbtn);
        View outputFrame = fragment.findViewById(R.id.output_frame);

        btn_rez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("button", "click");
                BD_GAI bd_gai = new BD_GAI(getActivity().getApplicationContext());

                try {
                    foundElement = bd_gai.Search_SH(nomera.getText().toString(),
                            sts.getText().toString(),
                            "");
                    Log.i("data", "data was found");
                } catch (NullPointerException ex) {
                    Log.i("data", "data wasn't found");
                    Toast.makeText(getActivity().getApplicationContext(), "Результат не найден", Toast.LENGTH_LONG).show();
                }
            }
        });

        return fragment;
    }
}