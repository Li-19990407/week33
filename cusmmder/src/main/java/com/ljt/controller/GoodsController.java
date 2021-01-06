package com.ljt.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ljt.entity.Goods;
import com.ljt.service.GoodsService;
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
public class GoodsController {

    @Reference(url = "localhost:20880")
    GoodsService goodsService;

    @GetMapping("/finds")
    public Page<Goods> finds(@RequestParam(defaultValue = "1")Integer current,@RequestParam(defaultValue = "")String gname,

                             @RequestParam(defaultValue = "")String gtype,@RequestParam(defaultValue = "")String gclass){

        return  goodsService.finds(current,gname,gtype,gclass);
    }
}
