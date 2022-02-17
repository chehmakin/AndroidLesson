package com.example.androidlesson

import java.io.IOException

fun main(){
    val book = Book(1000, 5000)
    val magazine = Magazine(300, 1000)

    // Первая часть
    println("Book")
    println("${book.price}€")
    println(book.wordCount)
    println(book.getType())

    println("Magazine")
    println("${magazine.price}€")
    println(magazine.wordCount)
    println(magazine.getType())

    println(sum(15, 23))


    //Вторая часть

    val user = User(1, "Oleg", 18, Type.FULL)
    println(user.startTime)
    Thread.sleep(1000)
    println(user.startTime)


    val userList = mutableListOf(User(2, "eqw", 15, Type.DEMO)).apply {
        this.add(User(2, "eqw", 15, Type.DEMO))
        this.add(User(3, "zxc", 18, Type.FULL))
        this.add(User(4, "das", 21, Type.DEMO))
    }

    val fullList = mutableListOf<User>()
    userList.forEach {
        if (it.type == Type.FULL) fullList.add(it)
    }

    println(userList)
    println(fullList)

    val nameList = userList.map { user -> user.name }

    println("Первый элемент списка имен ${nameList.first()}")
    println("Последний элемент списка имен ${nameList.last()}")








}
val sum: (Int, Int) -> Int = {a:Int, b:Int ->
    a + b
}

fun User.overEighteen() {
    if (age >= 18) println("GOOD")
    else throw Exception("SMALL")
}


inline fun auth(updateCache:(Boolean) -> Unit, user:User){
    try{
        user.overEighteen()
        AuthObject.authSuccess()
        updateCache(true)
    }
    catch(exception: Exception){
        AuthObject.authFailed()
        updateCache(false)
        throw exception
    }
}



fun updateCache(checkCache: Boolean){
    if(checkCache){
        println("Кэш обновлен")
    }else{
        println("Кэш не обновлен")
    }
}