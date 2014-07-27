package com.mycompany.washlify;

import com.mycompany.washlify.items.CustomSettings1;

import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

@TargetApi(Build.VERSION_CODES.HONEYCOMB)
public class SearchLaundryActivity extends FragmentActivity implements OnItemClickListener{

	ListView laundryList;
	SearchLaundry searchTool;
	//FilterDialog dialog;
	CustomSettings1 filter;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_laundry);
	
		//dialog = new FilterDialog(this);
		
		filter= new CustomSettings1();
		
		
		ImageButton b= (ImageButton) findViewById(R.id.activity_search_btn_settings);
		b.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//dialog.show();
				
				FragmentTransaction ft= getSupportFragmentManager().beginTransaction();
				ft.add(R.id.activity_search_main_container, filter);
				
				ft.commit();
			} 
		});
		
		Button btemp= (Button) findViewById(R.id.activity_search_btn_loadmore);
		btemp.setOnClickListener( new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//dialog.show();
				
				Intent i = new Intent(getApplicationContext(), LaundryDetailActivity.class);
		        startActivity(i);
			} 
		});
		
		
		
		
		searchTool= SearchLaundry.getInstance();
		laundryList= (ListView)findViewById(R.id.activity_search_laundry_list);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        R.layout.list_item_view_search, R.id.search_result_title, searchTool.getList() );
		
		laundryList.setOnItemClickListener( this);
		
		laundryList.setAdapter(adapter);
		laundryList.setEnabled(true);
		laundryList.setClickable(true);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search_laundry, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		Log.d(DISPLAY_SERVICE, "clicked");
		
		//dummy
		Intent i = new Intent(getApplicationContext(), LaundryDetailActivity.class);
        startActivity(i);
	}
	

	
	
	
}
