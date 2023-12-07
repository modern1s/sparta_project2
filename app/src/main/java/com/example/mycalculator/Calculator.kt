package com.example.mycalculator

class Calculator {
    fun calculate(operation: Operation, a: Int, b: Int): Int {
        return operation.execute(a, b)
    }
}