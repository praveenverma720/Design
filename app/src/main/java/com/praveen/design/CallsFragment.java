package com.praveen.design;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by PRAVEEN on 27/08/2017.
 */
 public class CallsFragment extends Fragment {
    FragmentManager myFragmentManager;
   @Nullable  
   @Override  
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
     View rootView = inflater.inflate(R.layout.calls_activity,null);

     return rootView;  
   }  
 }  