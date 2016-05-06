package com.kevin.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.kevin.R;

/**
 * Created by Kevin on 2016/4/28.
 */
public class BaseActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    /**
     * activity跳转
     *
     * @param toClass
     */
    public void openActivity(Class<?> toClass) {
        Intent intent = new Intent(this, toClass);
        super.startActivity(intent);
        overridePendingTransition(R.anim.push_right_in, R.anim.push_left_out);
    }
}
