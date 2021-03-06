package com.OCR.Laz.TopQuiz.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.OCR.Laz.TopQuiz.R;

public class GameActivity extends AppCompatActivity {

   private TextView mQuestionText;
   private Button mAnswer1;
   private Button mAnswer2;
   private Button mAnswer3;
   private Button mAnswer4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        mQuestionText = (TextView) findViewById(R.id.activity_game_question_text);
        mAnswer1 = (Button) findViewById(R.id.activity_game_answer1_btn);
        mAnswer2 = (Button) findViewById(R.id.activity_game_answer2_btn);
        mAnswer3 = (Button) findViewById(R.id.activity_game_answer3_btn);
        mAnswer4 = (Button) findViewById(R.id.activity_game_answer4_btn);


     mAnswer1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             // The user just clicked
             Intent gameBackActivityIntent = new Intent(GameActivity.this, MainActivity.class);
             startActivity(gameBackActivityIntent);
         }
     });

    }
}