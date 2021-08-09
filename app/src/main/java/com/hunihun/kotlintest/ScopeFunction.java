package com.hunihun.kotlintest;

import android.os.Build;

import androidx.annotation.RequiresApi;

import static java.lang.Integer.sum;
import static kotlin.random.RandomKt.Random;

public class ScopeFunction {
    private void main() {

    }

    void apply() {
        // Java
        Person person = new Person();
        person.firstName = "홍";
        person.lastName = "길동";
    }

    void also() {
        int value = Random(100).nextInt(100);
        System.out.print(value);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    void let() {
        Integer number = null;
        String sumNumberStr = null;

        if (number != null) {
            sumNumberStr = "" + sum(10, number);
        }
    }

    void with() {
        Person person = new Person();
        person.work();
        person.sleep();
        System.out.println(person.getAge());
    }

    void run() {

    }
}
