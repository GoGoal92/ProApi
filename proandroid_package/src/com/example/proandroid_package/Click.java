package com.example.proandroid_package;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Shader.TileMode;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Click {

	public static void clickbtn(Button[] btn, Activity ac, View v,
			DrawerLayout mDrawerLayout) {
		// TODO Auto-generated method stub
		if (v == btn[0]) {
			btn[0].setBackgroundResource(R.drawable.home_select);

			btn[1].setBackgroundResource(R.drawable.q_and_a_xml);
			btn[2].setBackgroundResource(R.drawable.book_xml);
			btn[3].setBackgroundResource(R.drawable.score_xml);
			btn[4].setBackgroundResource(R.drawable.noti_xml);

			Intent reg = new Intent(ac.getApplicationContext(),
					MainActivity.class);
			ac.startActivity(reg);
			ac.overridePendingTransition(R.anim.translate1, R.anim.translate2);
			ac.finish();
		}
		if (v == btn[1]) {
			btn[1].setBackgroundResource(R.drawable.q_and_a_select);

			btn[0].setBackgroundResource(R.drawable.home_xml);
			btn[2].setBackgroundResource(R.drawable.book_xml);
			btn[3].setBackgroundResource(R.drawable.score_xml);
			btn[4].setBackgroundResource(R.drawable.noti_xml);
			Intent reg = new Intent(ac.getApplicationContext(), Qestion.class);
			ac.startActivity(reg);
			ac.overridePendingTransition(R.anim.translate_forward,
					R.anim.translate_forware1);

			ac.finish();

		}

		if (v == btn[2]) {
			btn[2].setBackgroundResource(R.drawable.book_select);

			btn[0].setBackgroundResource(R.drawable.home_xml);
			btn[1].setBackgroundResource(R.drawable.q_and_a_xml);
			btn[3].setBackgroundResource(R.drawable.score_xml);
			btn[4].setBackgroundResource(R.drawable.noti_xml);
		}
		if (v == btn[3]) {

			btn[3].setBackgroundResource(R.drawable.score_select);

			btn[0].setBackgroundResource(R.drawable.home_xml);
			btn[1].setBackgroundResource(R.drawable.q_and_a_xml);
			btn[2].setBackgroundResource(R.drawable.book_xml);
			btn[4].setBackgroundResource(R.drawable.noti_xml);

		}
		if (v == btn[4]) {
			btn[4].setBackgroundResource(R.drawable.noti_select);

			btn[0].setBackgroundResource(R.drawable.home_xml);
			btn[1].setBackgroundResource(R.drawable.q_and_a_xml);
			btn[2].setBackgroundResource(R.drawable.book_xml);
			btn[3].setBackgroundResource(R.drawable.score_xml);
		}

		if (v == btn[5]) {
			if (mDrawerLayout.isDrawerOpen(Gravity.RIGHT)) {
				mDrawerLayout.closeDrawer(Gravity.RIGHT);

			} else {
				mDrawerLayout.openDrawer(Gravity.RIGHT);
			}
		}
	}

	public static void clicktext_in_Question(TextView[] title, Activity ac,
			View v, DrawerLayout mDrawerLayout, ViewPager vpPager) {
		// TODO Auto-generated method stub
		
		if (v == title[0]) {
			title[0].setBackgroundResource(R.drawable.new_tab_select_xml);
			title[1].setBackgroundResource(R.drawable.top_xml);
			title[2].setBackgroundResource(R.drawable.ask_xml);
			vpPager.setCurrentItem(1);
		}
		if (v == title[1]) {
			title[1].setBackgroundResource(R.drawable.top_tab_select_xml);
			title[0].setBackgroundResource(R.drawable.newtext_xml);
			title[2].setBackgroundResource(R.drawable.ask_xml);
			vpPager.setCurrentItem(2);
		}
		if (v == title[2]) {
			title[2].setBackgroundResource(R.drawable.ask_tab_select_xml);
			title[1].setBackgroundResource(R.drawable.top_xml);
			title[0].setBackgroundResource(R.drawable.newtext_xml);
			vpPager.setCurrentItem(3);
		}
	}

	public static void Question_vp(int position, Activity ac, TextView[] title) {
		// TODO Auto-generated method stub
		
		if (position == 0) {
			Intent reg = new Intent(ac.getApplicationContext(),
					MainActivity.class);
			ac.startActivity(reg);
			ac.finish();
			ac.overridePendingTransition(R.anim.translate1, R.anim.translate2);
		} else if (position == 1) {
			title[0].setBackgroundResource(R.drawable.new_tab_select_xml);
			title[1].setBackgroundResource(R.drawable.top_xml);
			title[2].setBackgroundResource(R.drawable.ask_xml);
			
		} else if (position == 2) {
			title[1].setBackgroundResource(R.drawable.top_tab_select_xml);
			title[0].setBackgroundResource(R.drawable.newtext_xml);
			title[2].setBackgroundResource(R.drawable.ask_xml);
		} else if (position == 3) {
			title[2].setBackgroundResource(R.drawable.ask_tab_select_xml);
			title[1].setBackgroundResource(R.drawable.top_xml);
			title[0].setBackgroundResource(R.drawable.newtext_xml);
		} else if (position == 4) {

		}
	}

}
