package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class OrderStatusActivity extends Activity {

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order_status);
		
		Button button_signup = (Button) findViewById(R.id.activity_orderstatus_btn_list);
		button_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMyOrders();
            }
        });
		
		Button button_signup1 = (Button) findViewById(R.id.activity_orderstatus_btn_myorders);
		button_signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMyOrders();
            }
        });
		
		Button button_signup2 = (Button) findViewById(R.id.activity_orderstatus_btn_myaccount);
		button_signup2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMyAccount();
            }
        });
		
		Button button_signup3 = (Button) findViewById(R.id.activity_orderstatus_btn_myaddresses);
		button_signup3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMyAddresses();
            }
        });
		
		Button button_signup4 = (Button) findViewById(R.id.activity_orderstatus_btn_mypayments);
		button_signup4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoMyPayments();
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.order_status, menu);
		return true;
	}

	private void gotoMyOrders()
	{
        Intent i = new Intent(getApplicationContext(), MyOrdersActivity.class);
        startActivity(i);

	}

	private void gotoMyAccount()
	{
        Intent i = new Intent(getApplicationContext(), MyAccountActivity.class);
        startActivity(i);

	}

	private void gotoMyAddresses()
	{
        Intent i = new Intent(getApplicationContext(), MyAddressesActivity.class);
        startActivity(i);

	}

	private void gotoMyPayments()
	{
        Intent i = new Intent(getApplicationContext(), MyPaymentsActivity.class);
        startActivity(i);

	}

}
