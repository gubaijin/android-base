package com.kevin.base;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.kevin.R;
import com.kevin.welcome.WelcomeActivity;

/**
 * 启动页
 */
public class SplashActivity extends BaseActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        init();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openActivity(WelcomeActivity.class);
            }
        }, 3000);
    }

    /**
     * 可以做一些初始化操作
     */
    private void init() {
    }
}
