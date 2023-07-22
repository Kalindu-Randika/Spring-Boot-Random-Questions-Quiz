package com.telusko.Quizapp.controller;

import com.telusko.Quizapp.domain.Questions;
import com.telusko.Quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {

    @Autowired
    QuizService quizService;

    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category, @RequestParam int numQ, @RequestParam String title){
        return quizService.createQuiz(category,numQ,title);

    }

    @GetMapping("get/{quizid}")
    public ResponseEntity<List<Questions>> getQuizQuestions(@PathVariable Integer quizid){

    }

}
