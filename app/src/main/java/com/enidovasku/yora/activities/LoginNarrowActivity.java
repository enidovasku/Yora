package com.enidovasku.yora.activities;

import android.os.Bundle;
import android.util.Log;

import com.enidovasku.yora.R;
import com.enidovasku.yora.fragments.LoginFragment;

public class LoginNarrowActivity  extends BaseActivity implements LoginFragment.Callbacks{
    @Override
    protected void onCreate(Bundle savedState){
        super.onCreate(savedState);

        setContentView(R.layout.activity_login_narrow);
    }

    @Override
    public void onLoggedIn() {
        setResult(RESULT_OK);
        finish();
    }
}
