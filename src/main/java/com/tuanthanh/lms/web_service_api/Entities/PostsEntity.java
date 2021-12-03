package com.tuanthanh.lms.web_service_api.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.registry.infomodel.User;

@Entity
@Table(name = "post")
public class PostsEntity extends BaseEntity{
    @Column(name = "title")
    private String title;
    @Column(name = "summary")
    private String summary;
    @Column(name = "content")
    private String content;
    @Column(name = "status")
    private String status;
    @Column(name = "vote")
    private Long vote;
    @OneToMany( mappedBy = "post" )
    private List<CommentsEntity> comments = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoriesEntity category;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userPost;
    @OneToMany( mappedBy = "postReport" )
    private List<ReportsEntity> postReport = new ArrayList<>();
    @ManyToMany(mappedBy = "posts")
    private List<GroupsEntity> groupPost = new ArrayList<>();
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public Long getVote() {
        return vote;
    }
    public void setVote(Long vote) {
        this.vote = vote;
    }
    public List<CommentsEntity> getComments() {
        return comments;
    }
    public void setComments(List<CommentsEntity> comments) {
        this.comments = comments;
    }
    public CategoriesEntity getCategory() {
        return category;
    }
    public void setCategory(CategoriesEntity category) {
        this.category = category;
    }
    public UserEntity getUser() {
        return userPost;
    }
    public void setUser(UserEntity userPost) {
        this.userPost = userPost;
    }
    public UserEntity getUserPost() {
        return userPost;
    }
    public void setUserPost(UserEntity userPost) {
        this.userPost = userPost;
    }
    public List<ReportsEntity> getPostReport() {
        return postReport;
    }
    public void setPostReport(List<ReportsEntity> postReport) {
        this.postReport = postReport;
    }
    public List<GroupsEntity> getGroupPost() {
        return groupPost;
    }
    public void setGroupPost(List<GroupsEntity> groupPost) {
        this.groupPost = groupPost;
    }
   
}
