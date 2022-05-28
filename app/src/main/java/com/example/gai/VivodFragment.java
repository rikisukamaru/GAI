package com.example.gai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VivodFragment extends Fragment {
    private TextView gos;
    private TextView sts;
    private TextView fio;
    private TextView marka;
    private TextView sht;
    private TextView ugn;
    private TextView vin;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_vivod,container,false);

        gos = fragment.findViewById(R.id.Gos_nom);
        sts = fragment.findViewById(R.id.textView7);
        fio = fragment.findViewById(R.id.textView9);
        marka = fragment.findViewById(R.id.textView11);
        sht = fragment.findViewById(R.id.textView13);
        ugn = fragment.findViewById(R.id.textView15);
        vin = fragment.findViewById(R.id.textView17);

        return fragment;
    }


    public void updateResult(Elements_GAI elements_gai) {
        gos.setText(elements_gai.Gos_nomer);
        sts.setText(elements_gai.STS);
        fio.setText(elements_gai.FIO);
        marka.setText(elements_gai.Marka);
        sht.setText(elements_gai.Shtraf);
        ugn.setText(elements_gai.Ugon);
        vin.setText(elements_gai.VIN);

    }
}