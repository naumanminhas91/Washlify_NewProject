package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class BillingInfoActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_billing_info);
		
		Button button_signup = (Button) findViewById(R.id.activity_billinginfo_btn_next);
		button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoOrderplaced();
            }
        });
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.billing_info, menu);
		return true;
	}
	
	private void gotoOrderplaced()
	{
        Intent i = new Intent(getApplicationContext(), OrderPlacedActivity.class);
        startActivity(i);

		
	}

}
