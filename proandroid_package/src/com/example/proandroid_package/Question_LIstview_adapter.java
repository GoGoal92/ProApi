package com.example.proandroid_package;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Question_LIstview_adapter extends BaseAdapter {
	
	String[] str1;
	LayoutInflater mLayoutInflater;
	Context con;
	Activity ac;

	public Question_LIstview_adapter(Context con, Activity ac, String[] str) {
		// TODO Auto-generated constructor stub
		this.str1 = str;
		this.con = con;
		this.ac = ac;
		mLayoutInflater = (LayoutInflater) con
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 10;
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View itemView = mLayoutInflater.inflate(R.layout.question_row,	null);


		return itemView;
	}

}
