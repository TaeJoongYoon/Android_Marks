package com.yoon.memoria.Splash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.yoon.memoria.Main.MainActivity;
import com.yoon.memoria.SignIn.SignInActivity;


public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    private SplashPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        presenter = new SplashPresenter(this);

        presenter.checkSigned();
    }

    @Override
    public void toSignin() {
        startActivity(new Intent(SplashActivity.this, SignInActivity.class));
        finish();
    }

    @Override
    public void toMain() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}