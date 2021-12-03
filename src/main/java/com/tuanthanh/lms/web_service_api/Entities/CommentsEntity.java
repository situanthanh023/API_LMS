package com.tuanthanh.lms.web_service_api.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class CommentsEntity extends BaseEntity{
    @Column(name = "content")
    private String content;
    @Column(name = "is_author")
    private boolean isAuthor;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private PostsEntity post;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean isAuthor() {
        return isAuthor;
    }
    public void setAuthor(boolean isAuthor) {
        this.isAuthor = isAuthor;
    }
    public PostsEntity getPost() {
        return post;
    }
    public void setPost(PostsEntity post) {
        this.post = post;
    }
    public UserEntity getUser() {
        return user;
    }
    public void setUser(UserEntity user) {
        this.user = user;
    }
    
}
