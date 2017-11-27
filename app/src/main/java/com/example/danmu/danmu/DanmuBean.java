package com.example.danmu.danmu;

import java.io.Serializable;

/**
 * Created by libo on 2017/11/27.
 */

public class DanmuBean implements Serializable{
    private int id;
    private int avatorId;
    private String userName;
    private String content;

    public DanmuBean(int id, int avatorId, String userName, String content) {
        this.id = id;
        this.avatorId = avatorId;
        this.userName = userName;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAvatorId() {
        return avatorId;
    }

    public void setAvatorId(int avatorId) {
        this.avatorId = avatorId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
