package com.example.android.nadris.ui.studentActivity.quizzes

import androidx.lifecycle.ViewModel
import com.example.android.nadris.network.firebase.dtos.QuestionData


class QuizViewModel:ViewModel() {
     fun delet() {
          this.onCleared()
     }

     var score:Int=0
     var currentPosition:Int=1
     var questionList:MutableList<QuestionData>? = null
     var selecedOption: MutableList<Int> = mutableListOf()
     var wrongQuestion : MutableList<Int> = mutableListOf()


}