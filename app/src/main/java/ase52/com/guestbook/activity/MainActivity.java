package ase52.com.guestbook.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;

import net.glxn.qrgen.android.QRCode;

import ase52.com.guestbook.R;
import ase52.com.guestbook.presenter.MainPresenter;
import ase52.com.guestbook.view.MainView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends MvpActivity<MainView, MainPresenter>
    implements MainView {

    @BindView(R.id.qrImage)
    ImageView qrImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @NonNull
    @Override
    public MainPresenter createPresenter() {
        return new MainPresenter();
    }

    @OnClick(R.id.fab)
    public void onFabClicked() {
        Bitmap myBitmap = QRCode.from("www.example.org").withSize(1000, 1000).bitmap();
        qrImage.setImageBitmap(myBitmap);
    }
}
