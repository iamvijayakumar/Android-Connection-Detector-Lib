package com.vk.connectiondetector;


import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ConnectionDetectionReceiver extends BroadcastReceiver {

	public boolean mIsCoonec = false;
	 Dialog mDialog;
	ConnectionListener mConnectionListener = new ConnectionListener();
    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo info = cm.getActiveNetworkInfo();
        if (info != null) {
            if (info.isConnected()) {
            	mIsCoonec = true;
            	mConnectionListener.isConnected = true;
            	
            	Toast.makeText(context, "Connected" +mConnectionListener.isConnected, Toast.LENGTH_SHORT).show();
            	
            } 
            else{
            	mConnectionListener.isConnected = false;
            }
        } 
        else{
            	mIsCoonec = false;
            	mConnectionListener.isConnected = false;
            	
            	Toast.makeText(context, "Lost Connection!" +mConnectionListener.isConnected, Toast.LENGTH_SHORT).show();
            	
        }
    }
   
  }