package com.jieke.qq.activity;

import java.lang.ref.WeakReference;

import com.jie.ke.my.qq.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * 
 * @author jieke
 *
 */
public class SplashActivity extends BaseActivity implements Runnable {

	private WeakReference<SplashActivity> activity = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		getWindow().setBackgroundDrawableResource(R.drawable.splash);
		activity = new WeakReference<SplashActivity>(this);
		new Handler().postDelayed(this, 3000);

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		startActivity(new Intent(activity.get(), MainActivity.class));
		this.finish();
	}
}
