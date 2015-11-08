package com.example.proandroid_package;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Vadapter extends PagerAdapter {
	String[] str1;
	LayoutInflater mLayoutInflater;
	Context con;
	Activity ac;

	public Vadapter(String[] str, Context applicationContext, Activity ac) {
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
		return view == ((LinearLayout) object);
	}

	@Override
	public Object instantiateItem(ViewGroup container, final int position) {

		View itemView = null;
		if (position == 0) {
			itemView = mLayoutInflater.inflate(R.layout.home, container, false);

		} else {
			itemView = mLayoutInflater.inflate(R.layout.home_pager_layout,
					container, false);
			LinearLayout back = (LinearLayout) itemView.findViewById(R.id.back);
			back.setBackgroundColor(Color.WHITE);

		}
		container.addView(itemView);

		return itemView;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((LinearLayout) object);
	}

}
