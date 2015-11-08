package com.example.proandroid_package;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Bookpageradapter extends PagerAdapter {
	String[] str1;
	LayoutInflater mLayoutInflater;
	Context con;
	Activity ac;

	public Bookpageradapter(String[] str, Context applicationContext,
			Qestion qestion) {
		// TODO Auto-generated constructor stub
		this.str1 = str;
		this.con = applicationContext;
		this.ac = ac;
		mLayoutInflater = (LayoutInflater) applicationContext
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		// TODO Auto-generated method stub
		return view == ((LinearLayout) object);
	}

	@Override
	public Object instantiateItem(ViewGroup container, final int position) {

		View itemView = mLayoutInflater.inflate(R.layout.question_row, container,
				false);

		container.addView(itemView);

		return itemView;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((LinearLayout) object);
	}

}
