package com.example.mycalculator

class DivideOperation : Operation {
    override fun execute(a: Int, b: Int): Int {
        if (b == 0) throw IllegalArgumentException("Cannot divide by zero.")
        return a / b
    }
}