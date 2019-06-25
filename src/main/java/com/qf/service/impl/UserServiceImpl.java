package com.qf.service.impl;

import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserService;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by DELL on 2019/6/17.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserInfoMapper userInfoMapper;

    public List<UserInfo> listUserInfo() {
        return userInfoMapper.listUserInfo();
    }

    public List<UserInfo> listUserInfoBy(UserInfoVo userInfoVo) {
        return userInfoMapper.listUserInfoBy(userInfoVo);
    }

    public boolean userLogin(UserInfoVo userInfoVo) {
        UserInfo userInfo = userInfoMapper.userLogin(userInfoVo);
        if(userInfo==null){
            return false;
        }else{
            return true;
        }
    }

    public boolean deleteUserInfoById(int userInfoId) {
        int count = userInfoMapper.deleteUserInfoById(userInfoId);
        if(count>0){
            return true;
        }
        return false;
    }

    public UserInfo getUserInfoById(int userInfoId) {
        return userInfoMapper.getUserInfoById(userInfoId);
    }

    public boolean updateUserInfo(UserInfo userInfo) {
        int count = userInfoMapper.updateUserInfo(userInfo);
        if(count>0){
            return true;
        }
        return false;
    }

    public boolean addUserInfo(UserInfo userInfo) {
        int count = userInfoMapper.addUserInfo(userInfo);
        if(count>0){
            return true;
        }
        return false;
    }

}
