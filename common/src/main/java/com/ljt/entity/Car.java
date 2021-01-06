package com.ljt.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author 李建通
 * @since 2020-12-28
 */
@Data
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "cid", type = IdType.AUTO)
    private Integer cid;

    @TableField("cname")
    private String gname;

    @TableField("price")
    private Integer price;

    @TableField("num")
    private Integer num;

    @TableField("zprice")
    private Integer zprice;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getGname() {
        return gname;
    }

    public void setCname(String gname) {
        this.gname = gname;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }
    public Integer getZprice() {
        return zprice;
    }

    public void setZprice(Integer zprice) {
        this.zprice = zprice;
    }

    @Override
    public String toString() {
        return "Car{" +
            "cid=" + cid +
            ", gname=" + gname +
            ", price=" + price +
            ", num=" + num +
            ", zprice=" + zprice +
        "}";
    }
}
