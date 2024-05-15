package com.example.imagepro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(Constants.CORRECT_ANSWER, 0)

        val signNameTextView: TextView = findViewById(R.id.sign_name)
        signNameTextView.text = username

        val signScoreTextView: TextView = findViewById(R.id.sign_score)
        signScoreTextView.text = " $totalQuestions soru içinde $correctAnswer doğru"

        val finishButton: Button = findViewById(R.id.btn_finish)
        finishButton.setOnClickListener {
            startActivity(Intent(this,HomeScreen::class.java))
        }
    }
}
