package com.praveen.design;

 import android.support.v4.app.Fragment;  
 import android.os.Bundle;  
 import android.support.annotation.Nullable;  
 import android.view.LayoutInflater;  
 import android.view.View;  
 import android.view.ViewGroup;
/**
 * Created by PRAVEEN on 27/08/2017.
 */
 public class TingFragment extends Fragment {
   @Nullable  
   @Override  
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {  
     View rootView = inflater.inflate(R.layout.ting_activity,null);
     return rootView;  
   }  
 }