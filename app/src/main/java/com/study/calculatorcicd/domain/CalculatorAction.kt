package com.study.calculatorcicd.domain

sealed interface CalculatorAction {
    object Calculate: CalculatorAction
    data class Number(val number: Int): CalculatorAction
    data class Op(val operation: Operation): CalculatorAction
    object Clear: CalculatorAction
    object Parentheses: CalculatorAction
    object Delete: CalculatorAction
    object Decimal: CalculatorAction
}