package com.king.condict.entry;

import org.springframework.data.annotation.Id;

/**
 * @Author: guoning
 * @Description: // 实体类
 * @Date: 2019/4/12 17:02
 * @Version: 1.0
 */
public class User {
    @Id
    public String _id;
    public String name;
    public String title;

    public void setId(String _id) {
        this._id = _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return _id;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }
}
