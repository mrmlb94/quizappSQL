package com.mrmlb.quizapp.app.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mrmlb.quizapp.app.Model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
