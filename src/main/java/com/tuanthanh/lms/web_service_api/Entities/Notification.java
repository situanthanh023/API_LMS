package com.tuanthanh.lms.web_service_api.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "notifications")
public class Notification extends BaseEntity{   
    @Column(name = "content")
    private String content;
    @Column(name = "type")
    private String type;
    @Column(name = "delete_notify")
    private boolean deleteNotify;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isDeleteNotify() {
        return deleteNotify;
    }
    public void setDeleteNotify(boolean deleteNotify) {
        this.deleteNotify = deleteNotify;
    }
    
}
