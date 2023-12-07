package com.example.mycalculator

fun main() {
    val firstNumber = inputMyNumber("number").toString().toInt()
    val operator = inputMyNumber("operator").toString()
    val secondNumber = inputMyNumber("number").toString().toInt()


    val result = when (operator) {
        "+" -> Calculator().calculate(AddOperation(), firstNumber, secondNumber)
        "-" -> Calculator().calculate(SubtractOperation(), firstNumber, secondNumber)
        "*" -> Calculator().calculate(MultiplyOperation(), firstNumber, secondNumber)
        "/" -> Calculator().calculate(DivideOperation(), firstNumber, secondNumber)
        else -> throw IllegalArgumentException("Invalid operator.")
    }

    println(result)
}


fun inputMyNumber(type: String): Any? {
    return when (type) {
        "number" -> {
            println("첫번쨰 숫자를 입력해주세요")
            while (true) {
                try {
                    var firstUsingNumber = readLine()
                    if (firstUsingNumber?.toIntOrNull() != null) {
                        return firstUsingNumber
                    } else {
                        println("숫자를 다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("숫자를 다시 입력해주세요")
                }
            }
        }
        "operator" -> {
            println("연산자를 입력해주세요")
            while(true) {
                try {
                    var usingOperator: String? = readLine()
                    if (usingOperator in listOf("+", "-", "*", "/")) {
                        return usingOperator
                    } else {
                        println("유효한 연산자(+, -, *, /)를 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("연산자를 다시 입력해주세요")
                }
            }
        }
        "number" -> {
            println("두번쨰 숫자를 입력해주세요")
            while (true) {
                try {
                    var secondUsingNumber = readLine()
                    if (secondUsingNumber?.toIntOrNull() != null) {
                        return secondUsingNumber
                    } else {
                        println("숫자를 다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("숫자를 다시 입력해주세요")
                }
            }
        }
        else -> null
    }
}