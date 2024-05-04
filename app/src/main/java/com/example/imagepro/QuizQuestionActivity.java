package com.example.imagepro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;

public class QuizQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question);

        // Correct variable declaration and method call
        ArrayList<Questions> questionList = new Constants().getQuestions();

        Log.i("Question Size", "Total questions: " + questionList.size());
    }
}
