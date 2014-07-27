package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MyPaymentsActivity extends Activity {

	private static String[] status;
	private ListView cardList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_payments);
	
		
		Button getclothes_button= (Button)findViewById(R.id.activity_mypayments_btn_addnew);
		getclothes_button.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), EditCardActivity.class);
				startActivity(i);
			}
		});
		
		
		RelativeLayout getclothes_button1= (RelativeLayout)findViewById(R.id.id3);
		getclothes_button1.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(), LoadMoneyActivity.class);
				startActivity(i);
			}
		});
		
		
		
		
		cardList= (ListView)findViewById(R.id.activity_mypayments_cards_list);
		
		status= new String[1];
		for (int i=0; i<1; i++)
		{
			status[i]= new String("VISA CARD");
		}
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		        R.layout.list_item_view_credit_card, R.id.list_item_card_title, status );
		cardList.setAdapter(adapter);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_payments, menu);
		return true;
	}
	
	

}
