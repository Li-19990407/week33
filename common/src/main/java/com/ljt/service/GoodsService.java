package com.ljt.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ljt.entity.Goods;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
public interface GoodsService  {

    public Page<Goods> finds(Integer current,String gname,String gtype,String gclass);

}
