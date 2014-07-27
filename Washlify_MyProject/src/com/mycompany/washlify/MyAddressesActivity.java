package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyAddressesActivity extends Activity {

	private static String[] status;
	private ListView laundryList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_addresses);
		
		
		
		laundryList= (ListView)findViewById(R.id.activity_myaddresses_list);
		
		status= new String[3];
		for (int i=0; i<3; i++)
		{
			status[i]= new String("2 South Park Ave, New York, NY");
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        R.layout.list_item_view_addresses, R.id.list_item_address_address, status );
		laundryList.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_addresses, menu);
		return true;
	}

}
