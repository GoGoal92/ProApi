package com.other.object;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface  Login {
	
	 @FormUrlEncoded
	  @POST("/Proandroid/login.php")
	public abstract void Login_singin(@Field("name") String email,@Field("pass")  String password, Callback<String> paramCallback);
}
