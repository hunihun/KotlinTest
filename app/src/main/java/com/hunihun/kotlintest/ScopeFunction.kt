package com.hunihun.kotlintest

import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.lang.Integer.sum
import kotlin.random.Random

fun main() {
    println()
}

fun apply() {
    val person = Person().apply {
        firstName = "홍"
        lastName = "길동"
    }
}

fun also() {
    Random.nextInt(100).also {
        Log.d("jsh","Random value: $it")
    }

    Random.nextInt(100).also { value ->
        Log.d("jsh","Random value: $value")
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun let() {
    val number: Int?

    val sumNumberStr = number?.let {
        "${sum(10, it)}"
    }
}

fun with() {
    val person = Person()
    with(person) {
        work()
        sleep()
        Log.d("jsh", age)
    }
}

fun run() {
    val age = Person().run {
        age = "30"
        sleep()
    }
}