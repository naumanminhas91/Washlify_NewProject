package com.mycompany.washlify;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends Activity {

	private static int SPLASH_TIME_OUT = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        //WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_splash);
		
 
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
		Intent i;
	    switch (item.getItemId()) {
	        case R.id.action_start:
	        	i = new Intent(getApplicationContext(), StartActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_search:
	        	i = new Intent(getApplicationContext(), SearchLaundryActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_detail:
	        	i = new Intent(getApplicationContext(), LaundryDetailActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_getclothes:
	        	i = new Intent(getApplicationContext(), GetMyClothesActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_select:
	        	i = new Intent(getApplicationContext(), SelectItemsActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_select_next:
	        	i = new Intent(getApplicationContext(), SelectItemsNextActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_filter:
	        	i = new Intent(getApplicationContext(), SearchLaundryActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_cart:
	        	i = new Intent(getApplicationContext(), CartActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_billing:
	        	i = new Intent(getApplicationContext(), BillingInfoActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_orderstatus:
	        	i = new Intent(getApplicationContext(), OrderStatusActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_placed:
	        	i = new Intent(getApplicationContext(), OrderPlacedActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_myorders:
	        	i = new Intent(getApplicationContext(), MyOrdersActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_payments:
	        	i = new Intent(getApplicationContext(), MyPaymentsActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_edit:
	        	i = new Intent(getApplicationContext(), EditCardActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_load:
	        	i = new Intent(getApplicationContext(), LoadMoneyActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_myaddresses:
	        	i = new Intent(getApplicationContext(), MyAddressesActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_myaccount:
	        	i = new Intent(getApplicationContext(), MyAccountActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_login:
	        	i = new Intent(getApplicationContext(), LoginActivity.class);
				startActivity(i);
	            return true;
	        case R.id.action_logup:
	        	i = new Intent(getApplicationContext(), SignUpActivity.class);
				startActivity(i);
	            return true;
	        
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
}
