package com.example.tflapp.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.tflapp.data.model.TFL
import androidx.compose.material.Divider as Divider

@SuppressLint("SuspiciousIndentation")
@Composable
fun BaseDashboardScreen() {
    val viewModel = hiltViewModel<DashboardViewModel>()
    val tflData by viewModel.tflData.collectAsState()
    DashboardScreen(tflData)
}



@SuppressLint("SuspiciousIndentation")
@Composable
fun DashboardScreen(tflData: TFL) {
    val colorList = listOf("#B36305", "#E32017" ,
            "#FFD300", "#00782A", "#F3A9BB", "#A0A5A9", "#9B0056", "#000000", "#003688", "#0098D4", "#0098D4" )


    Spacer(Modifier.height(30.dp))
        LazyColumn(
            modifier = Modifier.fillMaxSize()
                .padding(start = 16.dp, end = 16.dp, top = 30.dp)
        ) {
            val zipped  = tflData.zip(colorList)
            items(tflData.size) { index ->
                // Each item in the LazyColumn
                val tflItem = zipped.get(index)
                Card(
                    modifier = Modifier.fillMaxWidth()
                        .border(0.dp, Color.Transparent, RectangleShape)
                ) {
                    Row(modifier = Modifier
                        .fillMaxWidth().height(65.dp)
                        .testTag("line")
                        .semantics(mergeDescendants = true) {}) {
                        Column(
                            modifier = Modifier
                                .width(20.dp) // Set the width to 5dp
                                .fillMaxHeight()
                                .background(color = Color(android.graphics.Color.parseColor(tflItem.second)))
                        ) {
                            Text("   ")

                        }

                        Column (modifier = Modifier.padding(start = 10.dp)){
                            tflItem.first.id?.let {
                                Text(
                                    text = it.capitalize(),
                                    fontSize = 25.sp,
                                    modifier = Modifier.semantics { contentDescription = it + "line" }
                                        .focusable(true)

                                )
                            }
                            LazyRow {
                                tflData.get(index).lineStatuses?.let { ls ->
                                    items(ls.size) {
                                        ls.get(it)?.statusSeverityDescription.let {
                                            Text(
                                                it.toString(),
                                                modifier = Modifier.semantics {
                                                    if (it != null) {
                                                        contentDescription = it
                                                    }
                                                }
                                                    .focusable(true)

                                        ) }
                                    }
                                }
                            }
                        }

                    }
                    Divider(
                        modifier = Modifier
                            .fillMaxWidth(),
                        color = Color.Gray // Set the color to gray
                    )

                }
            }
        }

    }





