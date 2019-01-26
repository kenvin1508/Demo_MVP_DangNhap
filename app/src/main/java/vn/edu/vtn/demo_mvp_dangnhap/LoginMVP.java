package vn.edu.vtn.demo_mvp_dangnhap;

public interface LoginMVP {

    interface View {
        void showResultLogin(String message);
    }

    interface Presenter {
        void getDataLogin(String username, String password);
    }
}
