package com.ljt.service;

import com.ljt.entity.Car;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
public interface CarService  {

    public boolean add(Car car);

    public List<Car> findAll();

    public boolean clears();

}
