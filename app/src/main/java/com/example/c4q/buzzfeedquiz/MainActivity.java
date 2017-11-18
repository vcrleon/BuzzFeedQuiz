package com.example.c4q.buzzfeedquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.c4q.buzzfeedquiz.controller.QuizAdapter;
import com.example.c4q.buzzfeedquiz.model.Quiz;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView quizRecyclerView = findViewById(R.id.quiz_recycler_view);

        List<Quiz> quiz = new ArrayList<>();
        quiz.add(new Quiz("What does the word 'abrazar' mean?", R.drawable.hug1, R.drawable.hug2));
        quiz.add(new Quiz("What does the word 'feliz' mean?", R.drawable.feliz2, R.drawable.feliz1));
        quiz.add(new Quiz("Que rico postre! Me lo voy a _____!", R.drawable.comer2, R.drawable.comer1));
        quiz.add(new Quiz("En el dia sale el _____.", R.drawable.sol1, R.drawable.luna1));
        quiz.add(new Quiz("Y en la noche sale la _____.", R.drawable.sol1, R.drawable.luna1));

        QuizAdapter quizAdapter = new QuizAdapter(quiz);
        quizRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        quizRecyclerView.setAdapter(quizAdapter);

    }

}
