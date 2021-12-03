package com.tuanthanh.lms.web_service_api.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reports")
public class ReportsEntity extends BaseEntity{
    @Column(name = "content")
    private String content;
    @Column(name = "reason")
    private String reason;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userReport;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostsEntity postReport;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }
    public PostsEntity getPostReport() {
        return postReport;
    }
    public void setPostReport(PostsEntity postReport) {
        this.postReport = postReport;
    }
    public UserEntity getUserReport() {
        return userReport;
    }
    public void setUserReport(UserEntity userReport) {
        this.userReport = userReport;
    }
    
}
