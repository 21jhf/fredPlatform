package com.jin.com.jin.beans;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * Created by Fred Jin on 2017/2/18.
 */
public class User {
    private int id;
    private String userName;
    private String remark;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date createAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
}
