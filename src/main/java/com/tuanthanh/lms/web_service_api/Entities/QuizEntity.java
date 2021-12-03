package com.tuanthanh.lms.web_service_api.Entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "quiz")
public class QuizEntity extends BaseEntity{
    @Column(name = "title")
    private String title;
    @Column(name = "time_start")
    private Date timeStart;
    @Column(name = "time_end")
    private Date timeEnd;
    @Column(name = "duration")
    private Long duration;
    @Column(name = "number_question")
    private Long numberQuestion;
    @Column(name = "method")
    private boolean method;
    @OneToMany( mappedBy = "quiz" )
    private List<Questions> questions = new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoriesEntity categoryQuiz;
    @ManyToMany(mappedBy = "quizs")
    private List<GroupsEntity> groupQuiz = new ArrayList<>();
    @OneToOne(mappedBy = "quizStatus")
    private StatusQuiz status;
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getTimeStart() {
        return timeStart;
    }
    public void setTimeStart(Date timeStart) {
        this.timeStart = timeStart;
    }
    public Date getTimeEnd() {
        return timeEnd;
    }
    public void setTimeEnd(Date timeEnd) {
        this.timeEnd = timeEnd;
    }
    public Long getDuration() {
        return duration;
    }
    public void setDuration(Long duration) {
        this.duration = duration;
    }
    public Long getNumberQuestion() {
        return numberQuestion;
    }
    public void setNumberQuestion(Long numberQuestion) {
        this.numberQuestion = numberQuestion;
    }
    public boolean isMethod() {
        return method;
    }
    public void setMethod(boolean method) {
        this.method = method;
    }
    public List<Questions> getQuestions() {
        return questions;
    }
    public void setQuestions(List<Questions> questions) {
        this.questions = questions;
    }
    public CategoriesEntity getCategoryQuiz() {
        return categoryQuiz;
    }
    public void setCategoryQuiz(CategoriesEntity categoryQuiz) {
        this.categoryQuiz = categoryQuiz;
    }
    public List<GroupsEntity> getGroupQuiz() {
        return groupQuiz;
    }
    public void setGroupQuiz(List<GroupsEntity> groupQuiz) {
        this.groupQuiz = groupQuiz;
    }
    public StatusQuiz getStatus() {
        return status;
    }
    public void setStatus(StatusQuiz status) {
        this.status = status;
    }
    
}
