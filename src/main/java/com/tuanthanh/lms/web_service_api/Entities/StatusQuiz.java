package com.tuanthanh.lms.web_service_api.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "status_quiz")
public class StatusQuiz extends BaseEntity{
    @Column(name = "status")
    private boolean status;
    @Column(name = "score")
    private int score;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity userStatus;
    // @OneToMany( mappedBy = "statuses" )
    // private List<UserEntity> userStatus = new ArrayList<>();
    @OneToOne
    @JoinColumn(name = "quiz_id")
    private QuizEntity quizStatus;
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
    
}
