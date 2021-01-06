package com.ljt.controller;


import com.ljt.entity.Car;
import com.ljt.service.CarService;
import com.ljt.service.GoodsService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.http.cookie.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
@RestController
public class CarController {

    @Reference(url = "localhost:20880")
    CarService carService;

    @Autowired
    RedisTemplate redisTemplate;


    @PostMapping("/add")
    public boolean add(@RequestBody Car car){

        return carService.add(car);
    }

    @GetMapping("/findAll")
    public List<Car> findsAll(){

        return carService.findAll();
    }

    @DeleteMapping("/dele/{dele}")
    public boolean dele(){

        return carService.clears();
    }


}
