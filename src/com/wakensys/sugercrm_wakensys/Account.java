package com.wakensys.sugercrm_wakensys;

import com.wakensys.sugercrm_wakensys.view_details.Account_details;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class Account extends Activity implements OnClickListener{
	
	Button btn_fav;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account);
		
		btn_fav =(Button) findViewById(R.id.btn_fav);
		
		btn_fav.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		Intent q = new Intent(getBaseContext(),Account_details.class);
		startActivity(q);
		
	}
}
