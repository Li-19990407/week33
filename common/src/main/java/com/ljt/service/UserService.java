package com.ljt.service;

import com.ljt.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
public interface UserService  {

    public User login(String uphone,String pwd);
}
