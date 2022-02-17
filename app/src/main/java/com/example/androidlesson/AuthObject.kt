package com.example.androidlesson

object AuthObject:AuthCallback {
    override fun authSuccess() {
        println("SUCCESS")
    }

    override fun authFailed() {
        println("FAILED")
    }
}