package com.telusko.Quizapp.service;

import com.telusko.Quizapp.dao.QuestionDao;
import com.telusko.Quizapp.dao.QuizDao;
import com.telusko.Quizapp.domain.Questions;
import com.telusko.Quizapp.domain.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {

    @Autowired
    QuizDao quizDao;
    @Autowired
    QuestionDao questionDao;

    public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

        List<Questions> questions = questionDao.findRandomQuestionsByCategory(category, numQ);

        Quiz quiz = new Quiz();
        quiz.setTitle(title);
        quiz.setQuestions(questions);
        quizDao.save(quiz);
        return new ResponseEntity<>("succcess", HttpStatus.CREATED);
    }
}
