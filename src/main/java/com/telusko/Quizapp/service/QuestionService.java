package com.telusko.Quizapp.service;

import com.telusko.Quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public abstract class QuestionService {

    @Autowired
    QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public List<Questions> getAllQuestions() {
       return questionDao.findAll();
    }

    public List<Questions> getQuestionsByCategory(String category){
        return questionDao.findByCategory(category);
    }

}
