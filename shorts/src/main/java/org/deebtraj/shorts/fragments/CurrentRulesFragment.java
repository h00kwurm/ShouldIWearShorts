package org.deebtraj.shorts.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.deebtraj.shorts.R;

/**
 * Created by anatraj on 3/10/14.
 * Copyright © 2014 Zonoff, Inc.  All Rights Reserved.
 */
public class CurrentRulesFragment extends Fragment {

    public static final String TAG = "FRG_CR";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View fragmentView = inflater.inflate(R.layout.fragment_currentrules, null, false);




        return fragmentView;
    }
}
