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
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 1
        )


        questionsList.add(que1)

        val que2 = Questions(
            id = 2,
            image = R.drawable.b,
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 2
        )


        questionsList.add(que2)

        val que3 = Questions(
            id = 3,
            image = R.drawable.c,
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 3
        )


        questionsList.add(que3)
        val que4 = Questions(
            id = 4,
            image = R.drawable.d,
            optionOne = "A",
            optionTwo = "B",
            optionThree = "C",
            optionFour = "D",
            correctAnswer = 4
        )


        questionsList.add(que4)

         val que5 = Questions(
             id = 5,
             image = R.drawable.e,
             optionOne = "C",
             optionTwo = "E",
             optionThree = "F",
             optionFour = "G",
             correctAnswer = 2
         )


         questionsList.add(que5)

         val que6 = Questions(
             id = 6,
             image = R.drawable.f,
             optionOne = "A",
             optionTwo = "D",
             optionThree = "F",
             optionFour = "G",
             correctAnswer = 3
         )


         questionsList.add(que6)

         val que7 = Questions(
             id = 7,
             image = R.drawable.g,
             optionOne = "G",
             optionTwo = "P",
             optionThree = "R",
             optionFour = "G",
             correctAnswer = 1
         )


         questionsList.add(que7)

         val que8 = Questions(
             id = 8,
             image = R.drawable.h,
             optionOne = "H",
             optionTwo = "T",
             optionThree = "M",
             optionFour = "N",
             correctAnswer = 1
         )


         questionsList.add(que8)

         val que9 = Questions(
             id = 9,
             image = R.drawable.i,
             optionOne = "G",
             optionTwo = "I",
             optionThree = "R",
             optionFour = "G",
             correctAnswer = 2
         )

   ///
         questionsList.add(que9)

         val que10 = Questions(
             id = 10,
             image = R.drawable.j,
             optionOne = "A",
             optionTwo = "R",
             optionThree = "C",
             optionFour = "J",
             correctAnswer = 4
         )


         questionsList.add(que10)

         val que11 = Questions(
             id = 11,
             image = R.drawable.k,
             optionOne = "K",
             optionTwo = "M",
             optionThree = "N",
             optionFour = "J",
             correctAnswer = 1
         )


         questionsList.add(que11)

         val que12 = Questions(
             id = 12,
             image = R.drawable.l,
             optionOne = "L",
             optionTwo = "P",
             optionThree = "C",
             optionFour = "F",
             correctAnswer = 1
         )


         questionsList.add(que12)

         val que13 = Questions(
             id = 12,
             image = R.drawable.m,
             optionOne = "M",
             optionTwo = "R",
             optionThree = "E",
             optionFour = "F",
             correctAnswer = 1
         )


         questionsList.add(que12)

         val que14 = Questions(
             id = 14,
             image = R.drawable.n,
             optionOne = "Z",
             optionTwo = "U",
             optionThree = "N",
             optionFour = "F",
             correctAnswer = 3
         )


         questionsList.add(que14)


         val que15 = Questions(
             id = 15,
             image = R.drawable.o,
             optionOne = "O",
             optionTwo = "U",
             optionThree = "D",
             optionFour = "S",
             correctAnswer = 1
         )


         questionsList.add(que15)


         val que16 = Questions(
             id = 16,
             image = R.drawable.p,
             optionOne = "Z",
             optionTwo = "U",
             optionThree = "N",
             optionFour = "P",
             correctAnswer = 4
         )


         questionsList.add(que16)

         val que17 = Questions(
             id = 17,
             image = R.drawable.r,
             optionOne = "R",
             optionTwo = "N",
             optionThree = "E",
             optionFour = "P",
             correctAnswer = 1
         )


         questionsList.add(que17)

         val que18 = Questions(
             id = 18,
             image = R.drawable.s,
             optionOne = "Z",
             optionTwo = "S",
             optionThree = "Y",
             optionFour = "A",
             correctAnswer = 2
         )


         questionsList.add(que18)

         val que19 = Questions(
             id = 19,
             image = R.drawable.t,
             optionOne = "T",
             optionTwo = "K",
             optionThree = "L",
             optionFour = "C",
             correctAnswer = 1
         )


         questionsList.add(que19)

         val que20 = Questions(
             id = 18,
             image = R.drawable.u,
             optionOne = "U",
             optionTwo = "Y",
             optionThree = "Z",
             optionFour = "M",
             correctAnswer = 1
         )


         questionsList.add(que20)

         val que21 = Questions(
             id = 21,
             image = R.drawable.v,
             optionOne = "U",
             optionTwo = "V",
             optionThree = "L",
             optionFour = "F",
             correctAnswer = 2
         )


         questionsList.add(que21)

         val que22 = Questions(
             id = 22,
             image = R.drawable.y,
             optionOne = "A",
             optionTwo = "Y",
             optionThree = "B",
             optionFour = "R",
             correctAnswer = 2
         )


         questionsList.add(que22)

         val que23 = Questions(
             id = 23,
             image = R.drawable.z,
             optionOne = "Z",
             optionTwo = "L",
             optionThree = "J",
             optionFour = "R",
             correctAnswer = 1
         )


         questionsList.add(que23)



        // You can add more questions similarly
        return questionsList
    }
}