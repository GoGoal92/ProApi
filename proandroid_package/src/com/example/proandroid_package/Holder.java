package com.example.proandroid_package;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class Holder {

	public static void Holder(View arg0, ImageView upholder, int sh, int sw) {
		// TODO Auto-generated method stub
		//upholder.setVisibility(ImageView.VISIBLE);
		
		int x1 = arg0.getLeft();
		int x2 = arg0.getRight();
		int x3 = arg0.getTop();
		int x4 = arg0.getBottom();

		RelativeLayout.LayoutParams mParams2 = (RelativeLayout.LayoutParams) upholder
				.getLayoutParams();
		mParams2.leftMargin = x1;
		mParams2.rightMargin = x2;
		mParams2.topMargin = x3;
		mParams2.bottomMargin = x4;
		mParams2.width = sw;
		mParams2.height = sh;
		upholder.setLayoutParams(mParams2);
	}

}
