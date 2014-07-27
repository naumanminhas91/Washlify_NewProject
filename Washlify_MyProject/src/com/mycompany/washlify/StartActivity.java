package com.mycompany.washlify;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class StartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
/*		
		Button searchButton = (Button) findViewById(R.id.activity_start_goBtn);
		searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SearchLaundryActivity.class);
                startActivity(i);
            }
        });
		
		
		
		
		TextView loginText = (TextView) findViewById(R.id.activity_start_statement2_login);		
		loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoLogin();
            }
        });
*/
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}
	
	
	private void gotoLogin()
	{
		Intent i = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(i);
	}

}
