package com.study.MVP.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.study.MVP.Presenter.LoginPresenter;
import com.study.R;

public class LoginActivity extends AppCompatActivity implements LoginView {
    private EditText mUsername;
    private EditText mPassword;
    private Button mLogin;
    private Button mClear;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mUsername = findViewById(R.id.name);
        mPassword = findViewById(R.id.pass);
        mLogin = findViewById(R.id.login);
        mClear = findViewById(R.id.clear);

        mLoginPresenter = new LoginPresenter(this);
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mLoginPresenter.login();
            }
        });
        mClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
            }
        });
    }

    @Override
    public String getUsername() {
        return mUsername.getText().toString();
    }

    @Override
    public String getPassword() {
        return mPassword.getText().toString();
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginFailure() {
        Toast.makeText(this, "失败", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void clear() {
        mUsername.setText("");
        mPassword.setText("");
    }
}
