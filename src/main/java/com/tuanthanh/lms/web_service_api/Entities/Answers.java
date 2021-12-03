package com.tuanthanh.lms.web_service_api.Entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answer")
public class Answers extends BaseEntity{
    // private static final long serialVersionUID = 1L;
    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Questions question;
    @Column(name  = "content", nullable = false)
    private String content;
    @Column(name  = "correct", nullable = false)
    private boolean correct;
    public Answers() {
    }
    public Answers(Questions question, String content, boolean correct) {
        this.question = question;
        this.content = content;
        this.correct = correct;
    }
    public Questions getQuestion() {
        return question;
    }
    public void setQuestion(Questions question) {
        this.question = question;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean isCorrect() {
        return correct;
    }
    public void setCorrect(boolean correct) {
        this.correct = correct;
    }
      
}
