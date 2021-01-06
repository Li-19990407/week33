package com.ljt.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ljt.entity.User;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
public interface UserMapper extends BaseMapper<User> {

    public User login(String uphone,String pwd);

}
