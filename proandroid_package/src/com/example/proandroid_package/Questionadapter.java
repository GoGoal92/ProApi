package com.example.proandroid_package;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.v4.view.PagerAdapter;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;

public class Questionadapter extends PagerAdapter {

	String[] str1;
	LayoutInflater mLayoutInflater;
	Context con;
	Activity ac;

	public Questionadapter(String[] str, Context context, Activity ac2) {
		// TODO Auto-generated constructor stub
		this.str1 = str;
		this.con = context;
		this.ac = ac2;
		mLayoutInflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return 5;
	}

	@Override
	public boolean isViewFromObject(View view, Object object) {
		return view == ((LinearLayout) object);
	}

	@Override
	public Object instantiateItem(ViewGroup container, final int position) {

		View itemView = null;
		if (position == 1 || position == 2) {
			itemView = mLayoutInflater.inflate(R.layout.questionpage,
					container, false);
			ListView lv = (ListView) itemView.findViewById(R.id.newquestion_lv);
			SwipeRefreshLayout swipeLayout = (SwipeRefreshLayout) itemView
					.findViewById(R.id.swipe_refresh_whats_going_on);
			Question_LIstview_adapter ad = new Question_LIstview_adapter(con,
					ac, new String[] {});
			lv.setAdapter(ad);
			lv.setDividerHeight(3);
			ListviewRefresh.Refresh(swipeLayout, ac);
		} else if (position == 3) {
			itemView = mLayoutInflater.inflate(R.layout.ask_layout, container,
					false);

			Ask_View.view(itemView, ac, con);

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
