package cn.whale.mvp.mvpdemo.view;

/**
 * Created by nuts on 2018/11/6.
 */

public interface LoginView {
    void showLoginResultLog(boolean login);

    String getUsername();

    String getPwd();
}
