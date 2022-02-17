package com.example.androidlesson

class Book(override val price: Int, override val wordCount: Int) : Publication {


    override fun getType(): String {
        if (this.wordCount in 1001..7500) return "Short Story"
        else if (this.wordCount > 7500) return "Novel"
        return "Flash Fiction"
    }

    override fun equals(other: Any?): Boolean {
        println("По ссылке ${this === other}")
        println("Стандарт: ${super.equals(other)}")
        return super.equals(other)
    }

    fun buy(publication: Publication){
        println("The purchase is complete. The purchase amount was ${this.price}")
    }



}