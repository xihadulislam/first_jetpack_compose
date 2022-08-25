package com.xihadislam.first_jetpack_compose.ui.componenet

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun AppBar() {

    TopAppBar(
        title = { Text(text = "AppBar") },
        navigationIcon = { Icon(Icons.Default.Menu, contentDescription = "menu") },
        actions = {
            Spacer(modifier = Modifier.size(8.dp))
            Icon(Icons.Default.Search, contentDescription = "Search")
            Spacer(modifier = Modifier.size(8.dp))
            Icon(Icons.Default.ExitToApp, contentDescription = "logout")
            Spacer(modifier = Modifier.size(8.dp))
        },
    )

}

