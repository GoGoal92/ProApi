package com.other.object;

import gogoal.android_devloper.world.R;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public class Progrees extends ImageView {

	public Progrees(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		init();
	}

	public Progrees(Context context, AttributeSet attrs) {
		super(context, attrs);
		init();
	}

	public Progrees(Context context) {
		super(context);
		init();
	}

	private void init() {
		setBackgroundResource(R.drawable.loading);
		final AnimationDrawable frameAnimation = (AnimationDrawable) getBackground();
		post(new Runnable() {
			public void run() {
				frameAnimation.start();
			}
		});
	}
}