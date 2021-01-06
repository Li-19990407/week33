package com.ljt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ljt.entity.Goods;
import com.ljt.mapper.GoodsMapper;
import com.ljt.service.GoodsService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public Page<Goods> finds(Integer current,String gname,String gtype,String gclass) {

        QueryWrapper queryWrapper = new QueryWrapper();
        if (StringUtils.isEmpty(gname)){

            queryWrapper.like("gname",gname);
        }
        if (StringUtils.isEmpty(gtype)){

            queryWrapper.like("gtype",gtype);
        }
        if (StringUtils.isEmpty(gclass)){

            queryWrapper.like("gclass",gclass);
        }

        Page pageParam=new Page(current,3);
        Page page1 = goodsMapper.finds(pageParam, queryWrapper);
        return page1;
    }
}
