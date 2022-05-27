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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragment = inflater.inflate(R.layout.fragment_vivod,container,false);

        gos = fragment.findViewById(R.id.Gos_nom);
        TextView sts = fragment.findViewById(R.id.textView7);
        TextView fio = fragment.findViewById(R.id.textView9);
        TextView marka = fragment.findViewById(R.id.textView11);
        TextView sht = fragment.findViewById(R.id.textView13);
        TextView ugn = fragment.findViewById(R.id.textView15);
        TextView vin = fragment.findViewById(R.id.textView17);

        return fragment;
    }

    @Override
    public void onStart() {
        super.onStart();
        gos.setText(result.Gos_nomer);
    }

    public void updateResult(Elements_GAI elements_gai) {
        this.result = elements_gai;
        Log.i("data", "get data");
    }
}