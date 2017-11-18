package com.example.c4q.buzzfeedquiz.model;


/**
 * Created by c4q on 11/16/17.
 */

public class Quiz {
    private String question;
    private int choice1Image;
    private int choice2Image;

    public Quiz(String question, int choice1Image, int choice2Image){
        this.question = question;
        this.choice1Image = choice1Image;
        this.choice2Image = choice2Image;

    }

    public String getQuestion(){
        return question;
    }

    public int getChoice1Image(){
        return choice1Image;
    }

    public int getChoice2Image(){
        return choice2Image;
    }




}
