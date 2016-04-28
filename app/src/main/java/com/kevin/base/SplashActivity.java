package com.kevin.base;

import android.os.Bundle;
import android.widget.TextView;

import com.kevin.R;

public class SplashActivity extends BaseActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}
