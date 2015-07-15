package com.example.androidlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_TableLayout extends Activity {

	Button m_btnNext;

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tablelayout);


		m_btnNext = (Button) findViewById(R.id.btnNext);
		m_btnNext.setOnClickListener(new OnClickListener() {

		@Override
		public void onClick(View v) 
		{
			Intent m_intent = new Intent(Activity_TableLayout.this,Activity_FrameLayout.class);
			startActivity(m_intent);
		}
	});
	}


}
