package com.example.c4q.buzzfeedquiz.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.c4q.buzzfeedquiz.R;
import com.example.c4q.buzzfeedquiz.model.Quiz;
import com.example.c4q.buzzfeedquiz.views.QuizViewHolder;

import java.util.List;

/**
 * Created by c4q on 11/16/17.
 */

public class QuizAdapter extends RecyclerView.Adapter<QuizViewHolder> {

    private List<Quiz> quizList;

    public QuizAdapter(List<Quiz> quizList){
        this.quizList = quizList;
    }

    @Override
    public QuizViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.quiz_card_view, parent, false);
        return new QuizViewHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(QuizViewHolder holder, int position) {
        Quiz quiz = quizList.get(position);
        holder.onBind(quiz);
    }

    @Override
    public int getItemCount() {
        return quizList.size();
    }

}
