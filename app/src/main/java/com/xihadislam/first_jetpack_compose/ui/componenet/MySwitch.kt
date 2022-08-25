package com.xihadislam.first_jetpack_compose.ui.componenet

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySwitch() {

    val isChecked = remember {
        mutableStateOf(true)
    }
    Switch(
        checked = isChecked.value,
        onCheckedChange = { isChecked.value = it },
        modifier = Modifier.padding(8.dp)
    )

}