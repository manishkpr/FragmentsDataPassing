package com.example.simplefragmentexample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

public class MainActivity extends FragmentActivity implements OnButtonPressListener{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

	@Override
	public void onButtonPressed(String msg) {
		// TODO Auto-generated method stub
		 LayOutTwo Obj=(LayOutTwo) getSupportFragmentManager().findFragmentById(R.id.frag_2);
		 Obj.setMessage(msg);
	}

  
}
