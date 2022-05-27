package com.example.gai;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class VivodFragment extends Fragment {

    private Elements_GAI result;
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

    @Override
    public void onStart() {
        super.onStart();
        gos.setText(result.Gos_nomer);
        sts.setText(result.STS);
        fio.setText(result.FIO);
        marka.setText(result.Marka);
        sht.setText(result.Shtraf);
        ugn.setText(result.Ugon);
        vin.setText(result.VIN);
    }

    public void updateResult(Elements_GAI elements_gai) {
        this.result = elements_gai;
       // Log.i("data", "get data");
    }
}