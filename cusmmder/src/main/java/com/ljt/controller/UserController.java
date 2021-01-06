package com.ljt.controller;


import com.ljt.entity.User;
import com.ljt.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
@RestController
public class UserController {

    @Reference(url = "localhost:20880")
    UserService userService;

    @GetMapping("/login")
    public User login(@RequestParam(defaultValue = "")String uphone,@RequestParam(defaultValue = "")String pwd){

        return userService.login(uphone, pwd);
    }

}
