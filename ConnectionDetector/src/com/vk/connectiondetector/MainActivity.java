package com.vk.connectiondetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends Activity implements ConnectionListener{
   boolean isConnected;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		if(isConnected){
			//Do your Stuff here
			
		}else{
			//Do your Stuff here
		}
		
		
	}

	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return isConnected;
	}
}
