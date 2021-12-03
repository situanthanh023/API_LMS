package com.tuanthanh.lms.web_service_api.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "account")
public class AccountEntity extends BaseEntity{
    @Column(name = "user_name")
    private String userName;
    @Column(name = "password")
    private String password;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userAccount;
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public UserEntity getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(UserEntity userAccount) {
        this.userAccount = userAccount;
    }   
    
}
