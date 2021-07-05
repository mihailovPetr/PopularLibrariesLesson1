package com.example.popularlibrarieslesson1.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.popularlibrarieslesson1.model.ButtonNumber
import com.example.popularlibrarieslesson1.presentor.MainPresenter
import com.example.popularlibrarieslesson1.MainView
import com.example.popularlibrarieslesson1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), MainView {

    private lateinit var vb: ActivityMainBinding
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vb = ActivityMainBinding.inflate(layoutInflater)
        setContentView(vb.root)

        vb.btnCounter1.setOnClickListener { presenter.counterClick(ButtonNumber.ONE) }
        vb.btnCounter2.setOnClickListener { presenter.counterClick(ButtonNumber.TWO) }
        vb.btnCounter3.setOnClickListener { presenter.counterClick(ButtonNumber.THREE) }
    }

    override fun setButtonOneText(text: String) {
        vb.btnCounter1.text = text
    }

    override fun setButtonTwoText(text: String) {
        vb.btnCounter2.text = text
    }

    override fun setButtonThreeText(text: String) {
        vb.btnCounter3.text = text
    }
}