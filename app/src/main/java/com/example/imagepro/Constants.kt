package com.example.imagepro

import java.util.*

 object Constants {

     const val USER_NAME: String = "user_name"
     const val TOTAL_QUESTIONS: String = "total_question"

     const val CORRECT_ANSWER: String = "correct_answers"





     fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            id = 1,
            image = R.drawable.a,
            optionOne = "A",
            optionTwo = "B",
            question = "What?",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 1
        )


        questionsList.add(que1)

        val que2 = Questions(
            id = 2,
            image = R.drawable.b,
            question = "What?",
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 2
        )


        questionsList.add(que2)

        val que3 = Questions(
            id = 3,
            question = "What?",
            image = R.drawable.c,
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 3
        )


        questionsList.add(que3)
        val que4 = Questions(
            question = "What?",
            id = 4,
            image = R.drawable.d,
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 4
        )


        questionsList.add(que4)

        // You can add more questions similarly
        return questionsList
    }
}