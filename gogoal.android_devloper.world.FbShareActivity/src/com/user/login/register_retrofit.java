package com.user.login;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import android.view.View;

import com.other.object.Progrees;
import com.other.object.Regobject;
import com.other.object.Stringconverter;

public class register_retrofit {

	View pp;
	String str = "no data";
	String hosting = "http://www.mmstarpioneer.com/";

	public register_retrofit(View piv) {
		// TODO Auto-generated constructor stub
		pp = piv;
	}

	public void Register(String name, String email, String password) {
		// TODO Auto-generated method stub
		pp.setVisibility(Progrees.VISIBLE);

		((Regobject) new RestAdapter.Builder().setEndpoint(hosting)
				.setConverter(new Stringconverter()).build()
				.create(Regobject.class)).Reg(name, email, password,
				new Callback<String>() {

					@Override
					public void failure(RetrofitError arg0) {
						// TODO Auto-generated method stub
						str = arg0.getMessage();
						gogoal.android_devloper.world.Register.callstring(str);
						pp.setVisibility(View.GONE);
					}

					@Override
					public void success(String arg0, Response arg1) {
						// TODO Auto-generated method stub
						str = arg0;
						gogoal.android_devloper.world.Register.callstring(str);
						pp.setVisibility(View.GONE);

					}
				});

	}

}
