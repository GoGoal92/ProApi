package com.example.proandroid_package;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.support.v4.widget.DrawerLayout;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {

	private DrawerLayout mDrawerLayout;
	private ListView mDrawerList;
	private ArrayList<String> menuLists;
	private ArrayAdapter<String> adapter;
	Button[] btn = new Button[6];
	Button menu;
	int screenWidth, screenHeight;
	LayoutParams keyboard_LP, holderimage;
	int sw = 0;
	int sh = 0;
	ViewPager vpPager;
	Vadapter vadapter;
	Activity ac = this;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ID();

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);
		mDrawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED);

		menuLists = new ArrayList<String>();
		for (int i = 1; i <= 5; i++) {
			menuLists.add("text" + i);
		}

		adapter = new ArrayAdapter<String>(MainActivity.this,
				android.R.layout.simple_list_item_1, menuLists);
		mDrawerList.setAdapter(adapter);

	}

	private void ID() {
		// TODO Auto-generated method stub
		DisplayMetrics metrics = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		screenWidth = metrics.widthPixels;
		screenHeight = metrics.heightPixels;

		btn[0] = (Button) findViewById(R.id.home);
		btn[1] = (Button) findViewById(R.id.question);
		btn[2] = (Button) findViewById(R.id.book);
		btn[3] = (Button) findViewById(R.id.record);
		btn[4] = (Button) findViewById(R.id.notification);
		btn[5] = (Button) findViewById(R.id.menu);

		for (int i = 0; i < btn.length; i++) {
			sw = 0;
			sh = 0;
			sw = (screenWidth / 6);
			sh = (sw * 2) / 3;
			keyboard_LP = btn[i].getLayoutParams();
			keyboard_LP.width = sw;
			keyboard_LP.height = sh;
			btn[i].setLayoutParams(keyboard_LP);
			btn[i].setOnClickListener(this);

		}

		btn[0].setBackgroundResource(R.drawable.home_select);

		btn[1].setBackgroundResource(R.drawable.q_and_a_xml);
		btn[2].setBackgroundResource(R.drawable.book_xml);
		btn[3].setBackgroundResource(R.drawable.score_xml);
		btn[4].setBackgroundResource(R.drawable.noti_xml);

		vpPager = (ViewPager) findViewById(R.id.Mainpager);
		String[] str = new String[] {};

		vadapter = new Vadapter(str, getApplicationContext(), ac);
		vpPager.setAdapter(vadapter);

		vpPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageSelected(int position) {
				if (position == vpPager.getAdapter().getCount() - 1) {
					Intent reg = new Intent(MainActivity.this, Qestion.class);
					startActivity(reg);
					overridePendingTransition(R.anim.translate_forward,
							R.anim.translate_forware1);
					MainActivity.this.finish();

				}

			}

			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub

			}

		});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Click.clickbtn(btn,ac,v,mDrawerLayout);
	

	}

}
