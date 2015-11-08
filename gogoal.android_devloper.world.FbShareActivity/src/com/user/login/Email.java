package com.user.login;

import gogoal.android_devloper.world.FbShareActivity;
import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import android.view.View;
import android.widget.TextView;

import com.other.object.Login;
import com.other.object.Stringconverter;

public class Email {
	View pp;
	String str = "no data";
	String hosting = "http://www.mmstarpioneer.com/";
	TextView tt;

	public Email(View piv) {
		// TODO Auto-generated constructor stub
		pp = piv;
	}

	public void Login(String email, String password) {
		// TODO Auto-generated method stub
		pp.setVisibility(0);

		RestAdapter res = new RestAdapter.Builder().setEndpoint(hosting)
				.setConverter(new Stringconverter()).build();

		Login log = res.create(Login.class);
		log.Login_singin(email, password, new Callback<String>() {

			@Override
			public void success(String arg0, Response arg1) {
				// TODO Auto-generated method stub
				str = arg0;
				FbShareActivity.callstring(str);
				pp.setVisibility(View.GONE);
			}

			@Override
			public void failure(RetrofitError arg0) {
				// TODO Auto-generated method stub
				str = arg0.getMessage();
				FbShareActivity.callstring(str);
				pp.setVisibility(View.GONE);
			}
		});

	}

}
