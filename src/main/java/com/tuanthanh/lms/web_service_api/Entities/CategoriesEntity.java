package com.tuanthanh.lms.web_service_api.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class CategoriesEntity extends BaseEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @OneToMany( mappedBy = "category" )
    private List<PostsEntity> post = new ArrayList<>();
    @OneToMany( mappedBy = "categoryQuiz" )
    private List<QuizEntity> quiz = new ArrayList<>();
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<PostsEntity> getPost() {
        return post;
    }
    public void setPost(List<PostsEntity> post) {
        this.post = post;
    }
    public List<QuizEntity> getQuiz() {
        return quiz;
    }
    public void setQuiz(List<QuizEntity> quiz) {
        this.quiz = quiz;
    }
    
}
