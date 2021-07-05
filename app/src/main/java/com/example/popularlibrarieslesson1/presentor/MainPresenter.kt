package com.example.popularlibrarieslesson1.presentor

import com.example.popularlibrarieslesson1.model.ButtonNumber
import com.example.popularlibrarieslesson1.MainView
import com.example.popularlibrarieslesson1.model.CountersModel

class MainPresenter(private val view: MainView) {

    private val model = CountersModel()

    fun counterClick(buttonNumber: ButtonNumber) {

        val nextValue = model.next(buttonNumber).toString()

        when (buttonNumber) {
            ButtonNumber.ONE -> view.setButtonOneText(nextValue)
            ButtonNumber.TWO -> view.setButtonTwoText(nextValue)
            ButtonNumber.THREE -> view.setButtonThreeText(nextValue)
        }


    }
}