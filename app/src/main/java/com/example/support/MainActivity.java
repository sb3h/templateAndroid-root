package com.example.support;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	public static final Class thisClass = MainActivity.class;
	public static final String TAG = thisClass.getSimpleName();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activtity);
		
		TextView tv = (TextView) findViewById(R.id.tv);
		tv.setText(BuildConfig.API_SERVER_URL+" " + getString(R.string.resValue_buildType));
	}
	
	public void leftBtnClick(View v) {

	}
	
	public void rightBtnClick(View v) throws Exception {

	}
	
	
	
}