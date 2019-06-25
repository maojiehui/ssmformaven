package com.qf.vo;

/**
 * Created by DELL on 2019/5/9.
 */
public class UserInfoVo {
    String userName;
    String password;

    String regEmail;
    String mobile;

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", regEmail='" + regEmail + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
