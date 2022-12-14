package com.test_library

import android.util.Log

class LogDebug {
    companion object{
        fun printMessage(message : String){
            Log.e("Message : ",message)
        }
    }
}