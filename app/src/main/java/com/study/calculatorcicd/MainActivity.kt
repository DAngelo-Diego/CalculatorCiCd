package com.study.calculatorcicd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.study.calculatorcicd.presentation.CalculatorScreen
import com.study.calculatorcicd.ui.theme.MaterialCalculatorTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialCalculatorTheme {
                CalculatorScreen()
                }
            }
        }
    }


