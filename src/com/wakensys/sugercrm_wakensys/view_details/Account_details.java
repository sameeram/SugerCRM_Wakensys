package com.wakensys.sugercrm_wakensys.view_details;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.wakensys.sugercrm_wakensys.R;
import com.wakensys.sugercrm_wakensys.R.layout;

public class Account_details extends FragmentActivity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.account_details);
	
		FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_listView f_list = new Fragment_listView();
        fragmentTransaction.add(R.id.fragment_container, f_list, "f_list");
        fragmentTransaction.commit();
	}
	
	

}
