package com.xihadislam.first_jetpack_compose.ui.componenet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


@Composable
fun CounterApp() {

    val counter = remember {
        mutableStateOf(0)
    }
    Scaffold(
        Modifier.fillMaxSize(),
        topBar = { AppBar() },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                counter.value++
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "add")
            }
        },
        content = {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxSize()
            ) {
                MySwitch()
                Text(text = "You have push the button this many times")
                Text(text = "${counter.value}", style = MaterialTheme.typography.h4)
            }
        }
    )

}