package com.example.demo.controller;

import com.example.demo.model.QuizCategory;
import com.example.demo.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class QuizController {

    private final static String firstAPI = "https://opentdb.com/api.php?amount=5&category=11";
    private final static String secondAPI = "https://opentdb.com/api.php?amount=5&category=12";


    @Autowired
    private QuizService quizService;


    @GetMapping("/coding/exercise/quiz")
    public Map<String,List<QuizCategory>> resultAPI(){
        List<QuizCategory> quizCategories = quizService.getQuizCategories();
        Map<String,List<QuizCategory>> response = new HashMap<>();
        response.put("quiz",quizCategories);
        return response;
    }




}
