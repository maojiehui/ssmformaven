package com.qf.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.pojo.UserInfo;
import com.qf.service.UserService;
import com.qf.tools.MD5Utils;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by DELL on 2019/6/17.
 * restful
 */
@Controller
@RequestMapping("user")
public class UserInfoController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("listAllUserInfo")
    public Object listAllUserInfo(@RequestParam(required = true,defaultValue = "1")Integer pageNum,@RequestParam(required = true,defaultValue = "3")Integer pageSize){
        System.out.println("pageNum="+pageNum+"/tpageSize="+pageSize);
        PageHelper.startPage(pageNum, pageSize);
        List<UserInfo> userInfos = userService.listUserInfo();
        PageInfo<UserInfo> userInfoPageInfo = new PageInfo<UserInfo>(userInfos);
        return userInfoPageInfo;
    }

    @RequestMapping("listAllUserInfoBy")
    public Object listAllUserInfoBy(@RequestBody UserInfoVo userInfoVo){
        List<UserInfo> userInfos = userService.listUserInfoBy(userInfoVo);
        return userInfos;
    }

    @ResponseBody
    @RequestMapping("loginCheck")
    public Object loginCheck(@RequestBody UserInfoVo userInfoVo){
        System.out.println(userInfoVo);
        userInfoVo.setPassword(MD5Utils.myEncode(userInfoVo.getPassword()));
        return userService.userLogin(userInfoVo);
    }


    @ResponseBody
    @RequestMapping("deleteUserInfoById")
    public Object deleteUserInfoById(@RequestParam int userInfoId){
        System.out.println(userInfoId);

        return userService.deleteUserInfoById(userInfoId);
    }


    @ResponseBody
    @RequestMapping("getUserInfoById")
    public Object getUserInfoById(@RequestParam int userInfoId){
        return userService.getUserInfoById(userInfoId);
    }

    @ResponseBody
    @RequestMapping("updateUserInfo")
    public Object updateUserInfo(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        return userService.updateUserInfo(userInfo);
    }

    @ResponseBody
    @RequestMapping("regUser")
    public Object regUser(@RequestBody UserInfo userInfo){
        System.out.println(userInfo);
        userInfo.setPassword(MD5Utils.myEncode(userInfo.getPassword()));
        return userService.addUserInfo(userInfo);
    }


    @ResponseBody
    @RequestMapping("myTest")
    public Object myTest(){

        return "hello world";
    }

}
