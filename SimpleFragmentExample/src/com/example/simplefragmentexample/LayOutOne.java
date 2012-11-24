package com.example.simplefragmentexample;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class LayOutOne extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		 ViewGroup root = (ViewGroup) inflater.inflate(R.layout.layout_one, null);
		 init(root);
		return root;
	}
	OnButtonPressListener buttonListener;
	
	 @Override
	    public void onAttach(Activity activity) {
	        super.onAttach(activity);
	        try {
	        	buttonListener = (OnButtonPressListener) getActivity();
	        } catch (ClassCastException e) {
	            throw new ClassCastException(activity.toString() + " must implement OnFileSelectedListener");
	        }
	    }
     void init(ViewGroup root){
    	 Button but=(Button)root.findViewById(R.id.button1);
    	 but.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				buttonListener.onButtonPressed("Message From First Fragment");
			}
		});
     }
}
