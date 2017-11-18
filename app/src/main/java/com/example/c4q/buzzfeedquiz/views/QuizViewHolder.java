package com.example.c4q.buzzfeedquiz.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.c4q.buzzfeedquiz.R;
import com.example.c4q.buzzfeedquiz.model.Quiz;
import com.squareup.picasso.Picasso;

/**
 * Created by c4q on 11/16/17.
 */

public class QuizViewHolder extends RecyclerView.ViewHolder {

    private TextView question;
    private ImageButton choice1;
    private ImageButton choice2;

    public QuizViewHolder(View itemView) {
        super(itemView);
        question = itemView.findViewById(R.id.question_text_view);
        choice1 = itemView.findViewById(R.id.choice_1_image_button);
        choice2 = itemView.findViewById(R.id.choice_2_image_button);

    }

    public void onBind(Quiz quiz){
        question.setText(quiz.getQuestion());
        Picasso.with(itemView.getContext()).load(quiz.getChoice1Image()).into(choice1);
        Picasso.with(itemView.getContext()).load(quiz.getChoice2Image()).into(choice2);
    }

}
