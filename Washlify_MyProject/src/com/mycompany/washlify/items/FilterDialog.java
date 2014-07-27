package com.mycompany.washlify.items;

import com.mycompany.washlify.R;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class FilterDialog extends Dialog{

	public Activity c;
	public Dialog d;
	public View v;

	public FilterDialog(Activity a) 
	{
		super(a);
	    // TODO Auto-generated constructor stub
	    this.c = a;
		
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		
	    requestWindowFeature(Window.FEATURE_NO_TITLE);
	    setContentView(R.layout.custom_settings);
	    
	    v= (View ) findViewById(R.id.custom_settings_row1);
	    
	    v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                c.finish();
            }
        });
	    
	  }
	
}
