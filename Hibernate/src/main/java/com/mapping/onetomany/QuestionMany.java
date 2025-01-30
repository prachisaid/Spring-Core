package com.mapping.onetomany;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(name = "question_many")
public class QuestionMany {
    
    // Properties
    
    @Id
    @Column(name = "question_id")
    private int questionId;
    private String question;
    @OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
    List<AnswerMany> answers;
    
    // Methods
    public QuestionMany() {
    }

    public QuestionMany(int questionId, String question, List<AnswerMany> answers) {
        this.questionId = questionId;
        this.question = question;
        this.answers = answers;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<AnswerMany> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerMany> answers) {
        this.answers = answers;
    }

    @Override
    public String toString() {
        return "QuestionMany{" + "questionId=" + questionId + ", question=" + question + ", answers=" + answers + '}';
    }
    
}
