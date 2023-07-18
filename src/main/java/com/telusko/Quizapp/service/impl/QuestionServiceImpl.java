package com.telusko.Quizapp.service.impl;

import com.telusko.Quizapp.dao.QuestionDao;
import com.telusko.Quizapp.domain.Questions;
import com.telusko.Quizapp.service.QuestionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionDao questionDao;

    @Override
    public List<Questions> getAllQuestions() {
        return questionDao.findAll();
    }

    @Override
    public List<Questions> getQuestionsByCategory(String category) {
        return questionDao.findByCategory(category);
    }
}
