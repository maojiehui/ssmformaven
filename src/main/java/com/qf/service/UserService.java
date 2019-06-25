package com.qf.service;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

import java.util.List;

/**
 * Created by DELL on 2019/6/17.
 */
public interface UserService {

    public List<UserInfo> listUserInfo();
    public List<UserInfo> listUserInfoBy(UserInfoVo userInfoVo);
    public boolean userLogin(UserInfoVo userInfoVo);
    public boolean deleteUserInfoById(int userInfoId);
    public UserInfo getUserInfoById(int userInfoId);
    public boolean updateUserInfo(UserInfo userInfo);
    public boolean addUserInfo(UserInfo userInfo);
}
