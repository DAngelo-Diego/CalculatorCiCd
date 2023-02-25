package com.study.calculatorcicd.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.study.calculatorcicd.domain.CalculatorAction
import com.study.calculatorcicd.domain.ExpressionWriter

class CalculatorViewModel(
    private val writer: ExpressionWriter = ExpressionWriter()
): ViewModel() {

    var expression by  mutableStateOf("")
        private set

    fun onAction(action: CalculatorAction) {
        writer.processAction(action)
        this.expression = writer.expression
    }

}