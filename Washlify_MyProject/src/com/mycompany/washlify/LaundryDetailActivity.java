package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class LaundryDetailActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_laundry_detail);
		
		Button getclothes_button= (Button)findViewById(R.id.activity_detail_btn_getclothes);
		getclothes_button.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), GetMyClothesActivity.class);
				startActivity(i);
			}
		});
		
		
		Button selectitems_button= (Button)findViewById(R.id.activity_detail_btn_selectitems);
		selectitems_button.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), SelectItemsActivity.class);
				startActivity(i);
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.laundry_detail, menu);
		return true;
	}

}
