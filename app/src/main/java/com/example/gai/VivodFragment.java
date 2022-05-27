package com.example.gai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VivodFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_vivod,container,false);
        TextView gos = fragment.findViewById(R.id.Gos_nom);
        TextView sts = fragment.findViewById(R.id.textView7);
        TextView fio = fragment.findViewById(R.id.textView9);
        TextView marka = fragment.findViewById(R.id.textView11);
        TextView sht = fragment.findViewById(R.id.textView13);
        TextView ugn = fragment.findViewById(R.id.textView15);
        TextView vin = fragment.findViewById(R.id.textView17);

   //     BD_GAI bd_gai = new BD_GAI(getActivity().getApplicationContext());



        return fragment;
    }


}