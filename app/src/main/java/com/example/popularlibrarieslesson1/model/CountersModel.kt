package com.example.popularlibrarieslesson1.model

class CountersModel {
    private val counters = mutableListOf(0, 0, 0)

    fun next(index: ButtonNumber) = ++counters[index.value]

}