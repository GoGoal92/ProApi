package com.example.proandroid_package;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class Ask_View {

	public static void view(View itemView, Activity ac, Context con) {
		// TODO Auto-generated method stub
		EditText titleed = (EditText) itemView.findViewById(R.id.edtitle);
		EditText detailed = (EditText) itemView.findViewById(R.id.eddetail);
		Spinner sp = (Spinner) itemView.findViewById(R.id.spinner);
		Button btn = (Button) itemView.findViewById(R.id.spinner);
	}

}
