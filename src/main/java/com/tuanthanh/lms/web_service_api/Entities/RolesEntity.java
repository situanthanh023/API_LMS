package com.tuanthanh.lms.web_service_api.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class RolesEntity extends BaseEntity{
    @Column(name = "role_type")
    private String roleType;

    @ManyToMany(mappedBy = "roles")
    private List<UserEntity> posts = new ArrayList<>();

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public List<UserEntity> getPosts() {
        return posts;
    }

    public void setPosts(List<UserEntity> posts) {
        this.posts = posts;
    }
    
}
