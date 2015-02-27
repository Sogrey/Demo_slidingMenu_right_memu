package com.example.zhy_slidingmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;

public class MainActivity extends Activity
{
	private SlidingMenu mMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		mMenu = (SlidingMenu) findViewById(R.id.id_menu);
//		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(0,
//				LinearLayout.LayoutParams.MATCH_PARENT,0.3f);
//		mMenu.setLayoutParams(lp);
//		mMenu.closeMenu();
	}

	public void toggleMenu(View view)
	{
		mMenu.toggle();
	}
}
