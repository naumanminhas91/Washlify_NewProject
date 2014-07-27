package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MyOrdersActivity extends Activity {

	ListView laundryList;
	
	private static String[] status;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_orders);
		
		laundryList= (ListView)findViewById(R.id.activity_myorders_list);
		
		
		status= new String[3];
		for (int i=0; i<3; i++)
		{
			status[i]= new String("In Progress");
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        R.layout.list_item_view_order, R.id.list_item_order_status, status );
		laundryList.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_orders, menu);
		return true;
	}

}
