package com.yata.luan.suse.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yata.luan.suse.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class OcorrenciaFragment extends Fragment {


    public OcorrenciaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ocorrencia, container, false);
        // Inflate the layout for this fragment
        return view;
    }

}
