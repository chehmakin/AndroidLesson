package com.example.androidlesson

open class Login(private val user: User): Action() {
    override fun doAction() {
        auth(::updateCache, user)
    }
}