package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class OrderPlacedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order_placed);
		
		Button button_signup = (Button) findViewById(R.id.activity_orderplaced_btn_done);
		button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoOrderStatus();
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.order_placed, menu);
		return true;
	}

	private void gotoOrderStatus()
	{
        Intent i = new Intent(getApplicationContext(), OrderStatusActivity.class);
        startActivity(i);

		
	}
}
