package com.study.calculatorcicd.domain

//this is called a utility class
enum class Operation(val symbol: Char) {
    ADD('+'),
    SUBTRACT('-'),
    MULTIPLY('*'),
    DIVIDE('/'),
    PERCENT('%')
}

//this expression provides a return like this "+-*/%"
val operationSymbols = Operation.values().map { it.symbol }.joinToString("")

//this function get an instance of the class operation and find the exact symbol
fun operationFromSymbol(symbol: Char): Operation {
    return Operation.values().find { it.symbol == symbol } ?: throw IllegalArgumentException("Invalid Symbol")
}