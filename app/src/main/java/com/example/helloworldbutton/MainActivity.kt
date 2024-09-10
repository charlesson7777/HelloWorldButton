package com.example.helloworldbutton

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClickMeButton()
        }
    }
}

@Composable
fun ClickMeButton() {
    val clickMe = remember {
        mutableStateOf(false)
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        if (clickMe.value) {
            Text(text = "Hello World")
        } else {
            Button(onClick = {
                clickMe.value = true
            }) {
                Text(text = "Click Me")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ClickMeButtonPreview() {
    ClickMeButton()
}