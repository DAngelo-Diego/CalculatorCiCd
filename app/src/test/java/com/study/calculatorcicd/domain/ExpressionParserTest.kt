package com.study.calculatorcicd.domain

import com.google.common.truth.Truth.assertThat
import org.junit.Test


class ExpressionParserTest {

    private lateinit var parser: ExpressionParser

    @Test
    fun `Simple expression is properly parse`(){
        // 1. GIVEN
        parser = ExpressionParser(calculation = "3+5")
        // 2. DO SOMETHING WITH WHAT'S GIVEN
        val actual = parser.parse()
        // 3. ASSERT EXPECTED = ACTUAL
        val expected = listOf(
            ExpressionPart.Number(3.0),
            ExpressionPart.Op(Operation.ADD),
            ExpressionPart.Number(5.0),

        )
        assertThat(expected).isEqualTo(actual)
    }

    @Test
    fun `Expression with parentheses is properly parsed`(){
        // 1. GIVEN
        parser = ExpressionParser(calculation = "1+(1+2)")
        // 2. DO SOMETHING
        val actual = parser.parse()
        // 3. ASSERT EXPECTED = ACTUAL
        val expected = listOf(
            ExpressionPart.Number(1.0),
            ExpressionPart.Op(Operation.ADD),
            ExpressionPart.Parentheses(type = ParenthesesType.Opening),
            ExpressionPart.Number(1.0),
            ExpressionPart.Op(Operation.ADD),
            ExpressionPart.Number(2.0),
            ExpressionPart.Parentheses(type = ParenthesesType.Closing),
            )
        assertThat(expected).isEqualTo(actual)
    }

}