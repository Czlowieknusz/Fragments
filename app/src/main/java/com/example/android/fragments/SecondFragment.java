package com.example.android.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Jam on 27.07.2017.
 */

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        LayoutInflater lf = getActivity().getLayoutInflater();
        View view = lf.inflate(R.layout.fragment_layout, container, false); //pass the correct layout name for the fragment
        TextView text = view.findViewById(R.id.fragment_tv);
        text.setText(R.string.fragment_text_second);
        return view;
    }
}
