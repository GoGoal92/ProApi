package com.other.something;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class Network_condition {

	public static boolean getconnnection(Context context) {
		// TODO Auto-generated method stub
		boolean con = false;
		ConnectivityManager cn = (ConnectivityManager) context
				.getSystemService(Context.CONNECTIVITY_SERVICE);
		NetworkInfo nf = cn.getActiveNetworkInfo();
		if (nf != null && nf.isConnected() == true) {
			con=true;

		} else {
			con=false;
			/*Toast.makeText(context, "Please check your network", 10).show();*/
		}

		return con;
	}

}
