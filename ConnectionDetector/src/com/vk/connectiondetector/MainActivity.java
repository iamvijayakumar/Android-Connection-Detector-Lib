package com.vk.connectiondetector;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
   boolean isConnected;
   ConnectionListener mConnectionListener = new ConnectionListener();
   
   Button checkStatus;
   TextView mTextView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		checkStatus = (Button)findViewById(R.id.button1);
		mTextView = (TextView)findViewById(R.id.textView1);
      
        
        checkStatus .setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				mTextView.setText(" ::: "+mConnectionListener.isConnected );
			}
		});
		if(mConnectionListener.isConnected){
		
			
		}else{
			
		}
		
		
	}


}
