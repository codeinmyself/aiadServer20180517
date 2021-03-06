package com.xmu.aiad.controller;


import com.xmu.aiad.model.User;
import com.xmu.aiad.service.IUserService;
import com.xmu.aiad.util.BaseController;
import com.xmu.aiad.util.JsonResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/")
public class UserController extends BaseController{


    @Resource(name="userService")
    private IUserService userService;

    @RequestMapping(value = "/query/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUserByNickname(@PathVariable int id){


        return userService.getUserById(id);
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String  hh(){
        return "hello";
    }

    @RequestMapping(value = "/getUserByTelephone",method = RequestMethod.POST)
    @ResponseBody
    public User getUserByTelephone(HttpServletRequest request, HttpServletResponse response){
        long telephone=Long.parseLong(request.getParameter("telephone"));
        return userService.getUserByTelephone(telephone);
    }
}
