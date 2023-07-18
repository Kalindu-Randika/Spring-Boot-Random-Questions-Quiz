package com.telusko.Quizapp.service;

import com.telusko.Quizapp.domain.Questions;

import java.util.List;

public interface  QuestionService {

    List<Questions> getAllQuestions();
    List<Questions> getQuestionsByCategory(String category);

}
