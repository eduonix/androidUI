package com.example.androidlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity 
{
	EditText m_etEmail,etUserName,m_etPass;
	Button m_btnNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		m_etEmail = (EditText) findViewById(R.id.etEmail);
		etUserName = (EditText) findViewById(R.id.etUserName);
		m_etPass = (EditText) findViewById(R.id.etPass);
		m_btnNext = (Button) findViewById(R.id.btnNext);


		m_btnNext.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) 
			{
				Intent m_intent = new Intent(MainActivity.this,Activity_TableLayout.class);
				startActivity(m_intent);
			}
		});


	}


}
