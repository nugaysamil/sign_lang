package com.example.imagepro

import java.util.*

 class Constants {

    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        val que1 = Questions(
            id = 1,
            image = "A.jpg",
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 1
        )


        questionsList.add(que1)

        val que2 = Questions(
            id = 2,
            image = "B.jpg",
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 2
        )


        questionsList.add(que2)

        val que3 = Questions(
            id = 3,
            image = "C.jpg",
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 3
        )


        questionsList.add(que3)
        val que4 = Questions(
            id = 4,
            image = "D.jpg",
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