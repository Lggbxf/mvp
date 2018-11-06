package cn.whale.mvp.mvpdemo.model;

/**
 * Created by nuts on 2018/11/6.
 */

public class LoginModelImpl implements LoginModel {
    @Override
    public boolean login(String username, String pwd) {
        if(username.equals("abc")&&pwd.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
