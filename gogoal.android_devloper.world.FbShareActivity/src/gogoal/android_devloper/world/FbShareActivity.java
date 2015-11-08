package gogoal.android_devloper.world;

import java.util.Arrays;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.UiLifecycleHelper;
import com.facebook.model.GraphUser;
import com.facebook.widget.LoginButton;
import com.facebook.widget.LoginButton.UserInfoChangedCallback;
import com.gogoal.api.Progrees;
import com.other.something.Network_condition;
import com.user.login.Email;

public class FbShareActivity extends Activity {

	private LoginButton loginBtn;
	private UiLifecycleHelper uiHelper;
	static TextView tex;

	Button reg, signin;
	EditText et1, et2;
	RelativeLayout pg;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		uiHelper = new UiLifecycleHelper(this, statusCallback);
		uiHelper.onCreate(savedInstanceState);

		setContentView(R.layout.main);

		loginBtn = (LoginButton) findViewById(R.id.loginButton1);
		signin = (Button) findViewById(R.id.signinbtn);
		reg = (Button) findViewById(R.id.registerbtn);
		et1 = (EditText) findViewById(R.id.editText1);
		et2 = (EditText) findViewById(R.id.editText2);
		pg = (RelativeLayout) findViewById(R.id.prgresslayout);
		tex = (TextView) findViewById(R.id.logtxxt);
		
		pg.setVisibility(4);

		loginBtn.setReadPermissions(Arrays.asList("email"));

		loginBtn.setUserInfoChangedCallback(new UserInfoChangedCallback() {
			@Override
			public void onUserInfoFetched(GraphUser user) {
				if (user != null) {
					Session session = Session.getActiveSession();
					Log.e("Error", session.getAccessToken());

				} else {
					Log.e("Error", "Error.");
				}
			}
		});

		reg.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent it = new Intent(getApplicationContext(), Register.class);
				startActivity(it);
			}
		});

		signin.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

				if (et1.getText().toString().length() < 1) {
					Toast.makeText(getApplicationContext(),
							"Please enter user name", 10).show();

				} else if (et2.getText().toString().length() < 1) {
					Toast.makeText(getApplicationContext(),
							"Please enter your password", 10).show();

				} else {
					boolean connection = Network_condition
							.getconnnection(getApplicationContext());
					if (connection) {
						Email email = new Email(pg);
						email.Login(et1.getText().toString(), et2.getText().toString());

						// new Userinformation().execute();
					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your network", 10).show();
					}

				}

			}
		});

	}

	private Session.StatusCallback statusCallback = new Session.StatusCallback() {
		@Override
		public void call(Session session, SessionState state,
				Exception exception) {
			if (state.isOpened()) {
				Log.e("MainActivity", "Facebook session opened.");
			} else if (state.isClosed()) {
				Log.e("MainActivity", "Facebook session closed.");
			}
		}
	};

	@Override
	public void onResume() {
		super.onResume();
		uiHelper.onResume();
	}

	@Override
	public void onPause() {
		super.onPause();
		uiHelper.onPause();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		uiHelper.onDestroy();
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		Session.getActiveSession().onActivityResult(this, requestCode,
				resultCode, data);
		if (Session.getActiveSession() != null
				|| Session.getActiveSession().isOpened()) {

		}
	}

	@Override
	public void onSaveInstanceState(Bundle savedState) {
		super.onSaveInstanceState(savedState);
		uiHelper.onSaveInstanceState(savedState);
	}

	public static void callstring(String str) {
		// TODO Auto-generated method stub
		tex.setVisibility(0);
		tex.setText(str);

	}

}
