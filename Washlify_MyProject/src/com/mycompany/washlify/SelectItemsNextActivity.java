package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SelectItemsNextActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_select_items_next);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.select_items_next, menu);
		return true;
	}

}
