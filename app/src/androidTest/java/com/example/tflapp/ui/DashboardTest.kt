package com.example.tflapp.ui

import androidx.compose.material.MaterialTheme
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import com.example.tflapp.data.model.TFL
import com.example.tflapp.data.model.TFLItemModel
import org.junit.Rule
import org.junit.Test

class DashboardTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testDashboardScreenTag() {
        // Set the content for the DashboardScreen
        composeTestRule.setContent {
            MaterialTheme {
                val tfl: TFL = TFL()
                tfl.addAll(listOf(TFLItemModel()))
                DashboardScreen(tfl)
            }
        }

        val text = composeTestRule.onNodeWithTag("line")
        text.assertExists()
    }
}
