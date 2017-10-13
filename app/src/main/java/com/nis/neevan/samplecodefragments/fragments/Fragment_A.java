package com.nis.neevan.samplecodefragments.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.nis.neevan.samplecodefragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_A extends Fragment {

    private Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


        //getActivity Means
        // it will call the fragment in
        // what so ever activity it is getting used.

        button = (Button)getActivity().findViewById(R.id.bn_fragmentA);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getActivity(), "BUTTON CLICKED", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
