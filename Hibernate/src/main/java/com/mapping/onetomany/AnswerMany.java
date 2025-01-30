package com.mapping.onetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "answer_many")
public class AnswerMany {
    
    // Properties
    @Id
    @Column(name = "answer_id")
    private int answerId;
    private String answer;
    @ManyToOne
    private QuestionMany question;
    
    // Methods
    public AnswerMany() {
    }

    public AnswerMany(int answerId, String answer) {
        this.answerId = answerId;
        this.answer = answer;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public QuestionMany getQuestion() {
        return question;
    }

    public void setQuestion(QuestionMany question) {
        this.question = question;
    }
}
