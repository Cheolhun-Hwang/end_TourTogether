package com.hchooney.qewqs.tourtogether.MyFragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hchooney.qewqs.tourtogether.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecommandFragment extends Fragment {
    private View view;

    public RecommandFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_recommand, container, false);


        return view;
    }

}
