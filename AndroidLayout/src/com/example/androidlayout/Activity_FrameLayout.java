package com.example.androidlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_FrameLayout  extends Activity {

	Button m_btnNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_framelayout);


		m_btnNext = (Button) findViewById(R.id.btnNext);
		m_btnNext.setVisibility(View.GONE);



	}

}