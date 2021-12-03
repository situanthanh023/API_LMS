package com.tuanthanh.lms.web_service_api.Entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question")
public class Questions extends BaseEntity{
    // private static final long serialVersionUID = 1L;
    @Column(name = "Content", nullable = false)
    private String content;
    @OneToMany(mappedBy = "question")
    private Set<Answers> answer = new HashSet<Answers>(0);
    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private QuizEntity quiz;
    public Questions() {
    }
    public Questions(String content, Set<Answers> answer) {
        this.content = content;
        this.answer = answer;
    }
    public Questions(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public Set<Answers> getAnswer() {
        return answer;
    }
    public void setAnswer(Set<Answers> answer) {
        this.answer = answer;
    }
    public QuizEntity getQuiz() {
        return quiz;
    }
    public void setQuiz(QuizEntity quiz) {
        this.quiz = quiz;
    }
     
}
