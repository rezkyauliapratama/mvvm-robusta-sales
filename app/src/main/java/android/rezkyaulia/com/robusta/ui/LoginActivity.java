package android.rezkyaulia.com.robusta.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.rezkyaulia.com.robusta.R;
import android.rezkyaulia.com.robusta.databinding.ActivityLoginBinding;
import android.rezkyaulia.com.robusta.ui.navigator.LoginNavigator;
import android.rezkyaulia.com.robusta.ui.viewmodel.LoginViewModel;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import timber.log.Timber;

/**
 * Created by Rezky Aulia Pratama on 3/8/2018.
 */

public class LoginActivity extends AppCompatActivity implements LoginNavigator{
    ActivityLoginBinding binding;
    LoginViewModel loginViewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login);
        loginViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);

        binding.content.btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timber.e("onClick  ");
                loginViewModel.login("sales1","1234");
            }
        });
    }

    @Override
    public void openMainActivity() {

    }

    @Override
    public void handleError(Throwable throwable) {

    }

    @Override
    public void login() {

    }
}
