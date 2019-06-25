package com.qf.mapper;

import com.qf.pojo.UserInfo;
import com.qf.vo.UserInfoVo;

import java.util.List;

/**
 * Created by DELL on 2019/6/17.
 */
public interface UserInfoMapper {

    public List<UserInfo> listUserInfo();

    public List<UserInfo> listUserInfoBy(UserInfoVo userInfoVo);

    public UserInfo userLogin(UserInfoVo userInfoVo);

    public int deleteUserInfoById(int userInfoId);

    public UserInfo getUserInfoById(int userInfoId);

    public int updateUserInfo(UserInfo userInfo);

    public int addUserInfo(UserInfo userInfo);
}
