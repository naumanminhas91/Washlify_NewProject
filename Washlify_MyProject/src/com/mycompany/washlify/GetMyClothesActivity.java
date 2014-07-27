package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class GetMyClothesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_get_my_clothes);
		
		Button button_signup = (Button) findViewById(R.id.activity_getclothes_btn_gotoCart);
		button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoCart();
            }
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.get_my_clothes, menu);
		return true;
	}

	
	private void gotoCart()
	{
        Intent i = new Intent(getApplicationContext(), CartActivity.class);
        startActivity(i);

		
	}
}
