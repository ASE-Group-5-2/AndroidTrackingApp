package ase52.com.guestbook.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;

import ase52.com.guestbook.R;
import ase52.com.guestbook.presenter.LoginPresenter;
import ase52.com.guestbook.view.LoginView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Drilon Blakqori on 11.12.17
 */

public class LoginActivity extends MvpActivity<LoginView, LoginPresenter> implements LoginView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
    }

    @NonNull
    @Override
    public LoginPresenter createPresenter() {
        return new LoginPresenter(this);
    }

    @OnClick(R.id.loginButton)
    public void onLoginClicked() {
        presenter.onLoginClicked();
    }
}
