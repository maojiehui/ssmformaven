package com.qf.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.dto.UserInfoDto;
import com.qf.pojo.UserInfo;
import com.qf.service.UserService;
import com.qf.tools.MD5Utils;
import com.qf.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @ResponseBody
    @RequestMapping("getUserData")
    public Object getUserData(String callback){
        //返回一个集合，包含两个对象，一个有效用户，一个无效用户
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setName("有效用户");
        userInfoDto.setValue(2);
        UserInfoDto userInfoDto1 = new UserInfoDto();
        userInfoDto1.setName("无效用户");
        userInfoDto1.setValue(4);
        List<UserInfoDto> userInfoDtos = new ArrayList<UserInfoDto>();
        userInfoDtos.add(userInfoDto);
        userInfoDtos.add(userInfoDto1);

        JSONPObject jsonpObject = new JSONPObject(callback,userInfoDtos);
        return jsonpObject;
    }

    @ResponseBody
    @RequestMapping("getUserDataOne")
    public Object getUserDataOne(){
        //返回一个集合，包含两个对象，一个有效用户，一个无效用户
        UserInfoDto userInfoDto = new UserInfoDto();
        userInfoDto.setName("有效用户");
        userInfoDto.setValue(5);
        UserInfoDto userInfoDto1 = new UserInfoDto();
        userInfoDto1.setName("无效用户");
        userInfoDto1.setValue(5);
        List<UserInfoDto> userInfoDtos = new ArrayList<UserInfoDto>();
        userInfoDtos.add(userInfoDto);
        userInfoDtos.add(userInfoDto1);

        return userInfoDtos;
    }


}
