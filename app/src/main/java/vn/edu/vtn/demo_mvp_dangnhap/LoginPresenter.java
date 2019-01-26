package vn.edu.vtn.demo_mvp_dangnhap;

public class LoginPresenter implements LoginMVP.Presenter {
    LoginMVP.View view;

    public LoginPresenter(LoginMVP.View view) {
        this.view = view;
    }

    @Override
    public void getDataLogin(String username, String password) {
        if (username.equals("VTN") && password.equals("123")) {
            view.showResultLogin("Login successfully !!! ");
        } else {
            view.showResultLogin("Login failure !!! ");
        }
    }
}
