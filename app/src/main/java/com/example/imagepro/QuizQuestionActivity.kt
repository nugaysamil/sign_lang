package com.example.imagepro

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import org.w3c.dom.Text
import java.lang.reflect.Type

class QuizQuestionActivity : AppCompatActivity(), OnClickListener {

    private lateinit var progressBar: ProgressBar
    private lateinit var tv_progress: TextView
    private lateinit var sign_question: TextView
    private lateinit var iv_image: ImageView
    private lateinit var sign_option_one: TextView
    private lateinit var sign_option_two: TextView
    private lateinit var sign_option_three: TextView
    private lateinit var sign_option_four: TextView
    private lateinit var btn_submit: Button


    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Questions>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mCorrectAnswer: Int = 0
    private var mUserName: String? ? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        // Initialize the UI components
        progressBar = findViewById(R.id.progressBar)
        tv_progress = findViewById(R.id.tv_progess)  // Ensure ID is correct
        sign_question = findViewById(R.id.sign_question)
        iv_image = findViewById(R.id.iv_image)
        sign_option_one = findViewById(R.id.sign_option_one)
        sign_option_two = findViewById(R.id.sign_option_two)
        sign_option_three = findViewById(R.id.sign_option_three)
        sign_option_four = findViewById(R.id.sign_option_four)
        btn_submit = findViewById(R.id.btn_submit)


        mQuestionList = Constants.getQuestions()
        setQuestion()

        sign_option_one.setOnClickListener(this)
        sign_option_two.setOnClickListener(this)
        sign_option_three.setOnClickListener(this)
        sign_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }

    private fun setQuestion() {
        val question = mQuestionList!![mCurrentPosition - 1]
        defaultOptionsView()

        if(mCurrentPosition == mQuestionList!!.size) {
            btn_submit.text = "BITTI"
        } else {
            btn_submit.text = "KAYDET"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition/${progressBar.max}"
        iv_image.setImageResource(question.image)
        sign_option_one.text = question.optionOne
        sign_option_two.text = question.optionTwo
        sign_option_three.text = question.optionThree
        sign_option_four.text = question.optionFour
    }

    private fun defaultOptionsView() {
        val options = arrayListOf(sign_option_one, sign_option_two, sign_option_three, sign_option_four)
        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.sign_option_one -> selectedOptionView(sign_option_one, 1)
            R.id.sign_option_two -> selectedOptionView(sign_option_two, 2)
            R.id.sign_option_three -> selectedOptionView(sign_option_three, 3)
            R.id.sign_option_four -> selectedOptionView(sign_option_four, 4)
            R.id.btn_submit -> if(mSelectedOptionPosition == 0) {
                mCurrentPosition++

                when {
                    mCurrentPosition <= mQuestionList!!.size -> {
                        setQuestion()
                    } else -> {
                        val intent = Intent(this,ResultActivity::class.java)
                    intent.putExtra(Constants.USER_NAME,mUserName)
                    intent.putExtra(Constants.CORRECT_ANSWER,mCorrectAnswer)
                    intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList!!.size)
                    startActivity(intent)
                    }
                }


            } else {
                val question = mQuestionList?.get(mCurrentPosition -1)
                if(question!!.correctAnswer != mSelectedOptionPosition) {
                    answerView(mSelectedOptionPosition,R.drawable.wrong_option_border_bg)
                }
                else {
                    mCorrectAnswer++
                }
                answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                if(mCurrentPosition == mQuestionList!!.size) {
                    btn_submit.text = "BITTI"
                } else {
                    btn_submit.text = "DİĞER SORUYA GEÇİNİZ"
                }
                mSelectedOptionPosition = 0
            }
        }
    }

    private fun answerView(answer: Int,drawableview: Int) {
        when(answer) {
            1-> {
                sign_option_one.background = ContextCompat.getDrawable(this,drawableview)
            }
            2-> {
                sign_option_two.background = ContextCompat.getDrawable(this,drawableview)
            }
            3-> {
                sign_option_three.background = ContextCompat.getDrawable(this,drawableview)
            }
            4-> {
                sign_option_four.background = ContextCompat.getDrawable(this,drawableview)
            }
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }
}
