package com.ljt.mapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ljt.entity.Goods;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
public interface GoodsMapper extends BaseMapper<Goods> {

    public Page<Goods> finds(Page page, @Param("ew")QueryWrapper queryWrapper);

}
