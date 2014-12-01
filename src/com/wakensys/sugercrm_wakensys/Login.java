package com.wakensys.sugercrm_wakensys;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import com.wakensys.sugercrm_wakensys.R;
import com.wakensys.sugercrm_wakensys.R.layout;

public class Login extends Activity implements OnClickListener {

	EditText userName, password;
	Button login;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		userName = (EditText) findViewById(R.id.et_user);
		password = (EditText) findViewById(R.id.et_pass);
		
		login = (Button) findViewById(R.id.btn_login);
		
		login.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Log.d("click", "login button clicked");
		
	}
	
}
