package cn.whale.mvp.mvpdemo.presenter;

import cn.whale.mvp.mvpdemo.model.LoginModel;
import cn.whale.mvp.mvpdemo.model.LoginModelImpl;
import cn.whale.mvp.mvpdemo.view.LoginView;

/**
 * Created by nuts on 2018/11/6.
 */

public class LoginPresenter {
    private LoginView loginView;
    private LoginModel loginModel;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
        loginModel = new LoginModelImpl();
    }

    public boolean login() {
        if (loginModel.login(loginView.getUsername(),loginView.getPwd())) {
            loginView.showLoginResultLog(true);
            return true;
        }
        loginView.showLoginResultLog(false);
        return false;
    }


}
