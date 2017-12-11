package ase52.com.guestbook.presenter;

import android.content.Context;
import android.content.Intent;

import com.hannesdorfmann.mosby3.mvp.MvpBasePresenter;

import ase52.com.guestbook.activity.MainActivity;
import ase52.com.guestbook.view.LoginView;

/**
 * Created by Drilon Blakqori on 11.12.17
 */

public class LoginPresenter extends MvpBasePresenter<LoginView> {

    private Context context;

    public LoginPresenter(Context context) {
        this.context = context;
    }

    public void onLoginClicked() {
        context.startActivity(new Intent(context, MainActivity.class));
    }
}
