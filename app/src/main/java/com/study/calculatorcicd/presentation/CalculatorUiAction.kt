package com.study.calculatorcicd.presentation

import androidx.compose.runtime.Composable
import com.study.calculatorcicd.domain.CalculatorAction

data class CalculatorUiAction(
    val text: String?,
    val highlightLevel: HighlightLevel,
    val action: CalculatorAction,
    val content: @Composable () -> Unit = {}
)

sealed interface HighlightLevel {
    object Neutral: HighlightLevel
    object SemiHighlighted: HighlightLevel
    object HighLighted: HighlightLevel
    object StronglyHighLighted: HighlightLevel
}
