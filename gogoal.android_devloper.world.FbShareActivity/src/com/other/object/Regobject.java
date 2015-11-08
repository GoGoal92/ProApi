package com.other.object;

import retrofit.Callback;
import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface Regobject {

	@FormUrlEncoded
	@POST("/Proandroid/userinformation.php")
	public abstract void Reg(@Field("name") String username,
			@Field("email") String email, @Field("pass") String password,
			Callback<String> paramCallback);

}
