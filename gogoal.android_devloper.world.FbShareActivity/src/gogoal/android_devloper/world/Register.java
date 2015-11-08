package gogoal.android_devloper.world;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.other.something.Network_condition;
import com.user.login.register_retrofit;

public class Register extends Activity {
	EditText edname, edpassword, edrepass, edemail;
	Button btnsignup;
	static TextView log;
	RelativeLayout piv ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);

		edname = (EditText) findViewById(R.id.edusername);
		edpassword = (EditText) findViewById(R.id.edpass);
		edrepass = (EditText) findViewById(R.id.edretypepass);
		edemail = (EditText) findViewById(R.id.edemail);
		btnsignup = (Button) findViewById(R.id.btnsignup);
		log=(TextView) findViewById(R.id.reg_lod);
		 piv = (RelativeLayout) findViewById(R.id.prgresslayout1);
		piv.setVisibility(4);
		 
		btnsignup.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (edname.getText().toString().length() < 1) {
					Toast.makeText(getApplicationContext(),
							"Please enter user name", 10).show();
				} else if (edpassword.getText().toString().length() < 1) {
					Toast.makeText(getApplicationContext(),
							"Please enter passwoed", 10).show();

				} else if (edrepass.getText().toString().length() < 1) {
					Toast.makeText(getApplicationContext(),
							"Please enter your password again", 10).show();

				} else if (edemail.getText().toString().length() < 1) {
					Toast.makeText(getApplicationContext(),
							"Please enter your email", 10).show();

				} else if (!edpassword.getText().toString()
						.equals(edrepass.getText().toString())) {
					Toast.makeText(getApplicationContext(),
							"Password are not match", 10).show();
				}

				else {
					boolean connection = Network_condition
							.getconnnection(getApplicationContext());
					if (connection) {
					
						register_retrofit rer = new register_retrofit(piv);
						rer.Register(edname.getText().toString(), edemail
								.getText().toString(), edpassword.getText()
								.toString());

					} else {
						Toast.makeText(getApplicationContext(),
								"Please check your network", 10).show();
					}
				}
			}

		});

	}

	public static void callstring(String str) {
		// TODO Auto-generated method stub
		log.setVisibility(TextView.VISIBLE);
		log.setText(str);
	}

}
