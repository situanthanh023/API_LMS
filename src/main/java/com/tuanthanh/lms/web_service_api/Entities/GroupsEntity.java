package com.tuanthanh.lms.web_service_api.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * GroupsEntity
 */
@Entity
@Table(name = "group_tb")
public class GroupsEntity extends BaseEntity{
    @Column(name = "group_name")
    private String groupName;
    @ManyToMany
        @JoinTable(name = "group_user",
        joinColumns = @JoinColumn(name = "group_id"),
        inverseJoinColumns = @JoinColumn(name = "user_id"))
    private List<UserEntity> users = new ArrayList<>();
    @ManyToMany
        @JoinTable(name = "group_post",
        joinColumns = @JoinColumn(name = "group_id"),
        inverseJoinColumns = @JoinColumn(name = "post_id"))
    private List<PostsEntity> posts = new ArrayList<>();
    @ManyToMany
        @JoinTable(name = "group_quiz",
        joinColumns = @JoinColumn(name = "group_id"),
        inverseJoinColumns = @JoinColumn(name = "quiz_id"))
    private List<QuizEntity> quizs = new ArrayList<>();
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public List<UserEntity> getUsers() {
        return users;
    }
    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }
    public List<PostsEntity> getPosts() {
        return posts;
    }
    public void setPosts(List<PostsEntity> posts) {
        this.posts = posts;
    }
    public List<QuizEntity> getQuizs() {
        return quizs;
    }
    public void setQuizs(List<QuizEntity> quizs) {
        this.quizs = quizs;
    }   
     
}