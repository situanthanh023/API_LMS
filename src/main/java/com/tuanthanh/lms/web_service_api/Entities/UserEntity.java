package com.tuanthanh.lms.web_service_api.Entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "User")
public class UserEntity extends BaseEntity{
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "status")
    private Integer status;
    @Column(name = "image_url")
    private String imageURL;
    @Column(name = "gender")
    private Boolean gender;
    @ManyToMany
        @JoinTable(name = "user_role",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<RolesEntity> roles = new ArrayList<RolesEntity>();
    @OneToMany( mappedBy = "user" )
    private List<CommentsEntity> comment = new ArrayList<>();
    @OneToMany( mappedBy = "userPost" )
    private List<PostsEntity> userPost = new ArrayList<>();
    @OneToMany( mappedBy = "userAccount" )
    private List<AccountEntity> userAccount = new ArrayList<>();
    @OneToMany( mappedBy = "userReport" )
    private List<ReportsEntity> userReport = new ArrayList<>();
    @ManyToMany(mappedBy = "users")
    private List<GroupsEntity> groupUser = new ArrayList<>();
    @OneToMany( mappedBy = "userStatus" )
    private List<StatusQuiz> statuses = new ArrayList<>();
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    public Boolean getGender() {
        return gender;
    }
    public void setGender(Boolean gender) {
        this.gender = gender;
    }
    public List<RolesEntity> getRoles() {
        return roles;
    }
    public void setRoles(List<RolesEntity> roles) {
        this.roles = roles;
    }
    public List<CommentsEntity> getComment() {
        return comment;
    }
    public void setComment(List<CommentsEntity> comment) {
        this.comment = comment;
    }
    public List<PostsEntity> getUserPost() {
        return userPost;
    }
    public void setUserPost(List<PostsEntity> userPost) {
        this.userPost = userPost;
    }
    public List<AccountEntity> getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(List<AccountEntity> userAccount) {
        this.userAccount = userAccount;
    }
    public List<ReportsEntity> getUserReport() {
        return userReport;
    }
    public void setUserReport(List<ReportsEntity> userReport) {
        this.userReport = userReport;
    }
    public List<GroupsEntity> getGroupUser() {
        return groupUser;
    }
    public void setGroupUser(List<GroupsEntity> groupUser) {
        this.groupUser = groupUser;
    }
    public List<StatusQuiz> getStatuses() {
        return statuses;
    }
    public void setStatuses(List<StatusQuiz> statuses) {
        this.statuses = statuses;
    }
    
    
}
