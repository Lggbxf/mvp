package cn.whale.mvp.mvpdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import cn.whale.mvp.mvpdemo.presenter.LoginPresenter;
import cn.whale.mvp.mvpdemo.view.LoginView;

public class MainActivity extends AppCompatActivity implements LoginView {

    @BindView(R.id.btn)
    Button btn;
    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loginPresenter = new LoginPresenter(this);
    }

    @Override
    public void showLoginResultLog(boolean login) {
        Toast.makeText(getApplicationContext(), "Result" + login, Toast.LENGTH_SHORT).show();
    }

    @Override
    public String getUsername() {
        return "abc";
    }

    @Override
    public String getPwd() {
        return "123";
    }

    @OnClick(R.id.btn)
    public void onViewClicked() {
        loginPresenter.login();
    }
}
