package com.ljt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljt.entity.Car;
import com.ljt.entity.Goods;
import com.ljt.mapper.CarMapper;
import com.ljt.service.CarService;
import org.apache.dubbo.config.annotation.Service;
import org.apache.http.cookie.Cookie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {

    @Autowired
    CarMapper carMapper;

    @Autowired
    RedisTemplate redisTemplate;

    @Override
    public boolean add(Car car) {

        car.setZprice(car.getNum()*car.getPrice());
        return this.saveOrUpdate(car);
    }

    @Override
    public List<Car> findAll() {

        Car car = new Car();
        Object car1 = redisTemplate.opsForHash().get("car", car);
        return this.list();
    }

    @Override
    public boolean clears() {

        carMapper.deleteByMap((Map<String, Object>) this.list());
        return true;
    }
}
