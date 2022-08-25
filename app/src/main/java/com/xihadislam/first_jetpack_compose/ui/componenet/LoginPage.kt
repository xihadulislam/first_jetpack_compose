package com.xihadislam.first_jetpack_compose.ui.componenet

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginPage() {

    Column(
        Modifier.run {
            fillMaxSize()
            padding(20.dp)
        },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        val userName = remember {
            mutableStateOf("")
        }
        val password = remember {
            mutableStateOf("")
        }


        Text(text = "Welcome to login screen ", fontSize = 28.sp)
        Spacer(modifier = Modifier.size(20.dp))
        OutlinedTextField(
            value = userName.value,
            onValueChange = { userName.value = it },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Person, contentDescription = "person")
            },
            label = { Text(text = "Username") },
            placeholder = { Text(text = "Enter you username") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = password.value,
            onValueChange = { password.value = it },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "loc")
            },
            label = { Text(text = "Password") },
            placeholder = { Text(text = "Enter you password") },
            modifier = Modifier.fillMaxWidth()

        )

        Spacer(modifier = Modifier.size(8.dp))
        Text(text = "Forgot password? ", fontSize = 16.sp)
        Spacer(modifier = Modifier.size(8.dp))
        Button(onClick = {}, Modifier.fillMaxWidth()) {
            Text(text = "Log in")
        }


    }

}