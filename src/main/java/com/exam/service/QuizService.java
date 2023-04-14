package com.exam.service;

import com.exam.models.exam.Category;
import com.exam.models.exam.Quiz;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Set;

public interface QuizService {

    public Quiz addQuiz(Quiz quiz);
    public Quiz updateQuiz(Quiz quiz);
    public Set<Quiz> getQuizzes();
    public Quiz getQuiz(Long quizId);
    public void deleteQuiz(long quizId);
    public List<Quiz> getQuizzesOfCategory(Category category);
}
