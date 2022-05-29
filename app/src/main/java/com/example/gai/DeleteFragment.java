package com.example.gai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;


public class DeleteFragment extends Fragment {
    private TextView delet_txt;
    private Button button_del;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_delete,container,false);
        delet_txt = fragment.findViewById(R.id.editTextTextPersonName3);
        button_del = fragment.findViewById(R.id.button2);
        button_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BD_GAI bd_gai = new BD_GAI(getActivity().getApplicationContext());
                try {
                    bd_gai.delete(delet_txt.getText().toString());
                    Toast.makeText(getActivity().getApplicationContext(),"Успешно удалено транспортное средство",Toast.LENGTH_SHORT).show();
                }
                catch (NullPointerException e)
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Результат не найден", Toast.LENGTH_LONG).show();
                }


            }
        });
        return fragment;
    }
}