package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class LoadMoneyActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_load_money);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.load_money, menu);
		return true;
	}

}
