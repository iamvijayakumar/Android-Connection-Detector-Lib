package com.vk.connectiondetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class ConnectionDetectionReceiver extends BroadcastReceiver implements ConnectionListener {

	boolean mIsCoonec = false;
	
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info != null) {
            if (info.isConnected()) {
            	mIsCoonec = true;
            
            	Toast.makeText(context, "Connected", Toast.LENGTH_SHORT).show();
            } 
        } 
        else{
            	mIsCoonec = false;
            	
            	Toast.makeText(context, "Last Connection!", Toast.LENGTH_SHORT).show();
            
        }
    }

	

	@Override
	public boolean isConnected() {
		
		return mIsCoonec;
	}
    
    
    
  }