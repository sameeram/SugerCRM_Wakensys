package com.wakensys.sugercrm_wakensys.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;

import com.wakensys.sugercrm_wakensys.R;
import com.wakensys.sugercrm_wakensys.R.layout;

public class Fragment_home extends Fragment implements OnClickListener {

	public final static String TAG = Fragment_home.class.getSimpleName();
	
	//Button btnFav;

	public static Fragment_home newInstance() {
		return new Fragment_home();
	}
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		
		View rootView = inflater.inflate(R.layout.fragment_home, container, false);
		
		//btnFav = (Button) rootView.findViewById(R.id.btn_Fav);
	//	btnFav.setOnClickListener(this);
		
		return rootView;
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//btnFav.setBackgroundDrawable(getResources().getDrawable(R.drawable.star_select));
	}
}