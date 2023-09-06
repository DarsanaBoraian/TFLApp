package com.example.tflapp.ui

import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.runTest
import org.junit.Assert
import org.junit.Test

class DashboardViewModelTest {

    @Test
    fun getTFLDataTest() {
        val mockRepository = com.example.tflapp.repository.MockRepositoryImpl()
        val viewModel = DashboardViewModel(mockRepository)
        Assert.assertEquals(0, viewModel.tflData.value.size)
        runTest {
            advanceUntilIdle()
        }
        Assert.assertEquals(1, viewModel.tflData.value.size)

    }


}