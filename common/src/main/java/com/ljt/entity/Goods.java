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
public class Goods implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "gid", type = IdType.AUTO)
    private Integer gid;

    @TableField("gname")
    private String gname;

    @TableField("gtype")
    private String gtype;

    @TableField("gclass")
    private String gclass;

    @TableField("price")
    private Integer price;

    @TableField("content")
    private String content;

    @TableField("address")
    private String address;

    @TableField("width")
    private String width;

    @TableField("usepath")
    private String usepath;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }
    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }
    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype;
    }
    public String getGclass() {
        return gclass;
    }

    public void setGclass(String gclass) {
        this.gclass = gclass;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    public String getUsepath() {
        return usepath;
    }

    public void setUsepath(String usepath) {
        this.usepath = usepath;
    }

    @Override
    public String toString() {
        return "Goods{" +
            "gid=" + gid +
            ", gname=" + gname +
            ", gtype=" + gtype +
            ", gclass=" + gclass +
            ", price=" + price +
            ", content=" + content +
            ", address=" + address +
            ", width=" + width +
            ", usepath=" + usepath +
        "}";
    }
}
