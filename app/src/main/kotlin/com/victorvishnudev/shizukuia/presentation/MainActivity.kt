package com.victorvishnudev.shizukuia.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3 materialTheme;
import androidx.compose.material3.Surface;
import androidx.compose.material3.Text;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.tooling.preview.Preview;
import com.victorvishnudev.shizukuia.ui.theme.ShizukuIAAssistantTheme;

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ShizukuIAAssistantTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = materialTheme.colorScheme.background) {
                    Greeting("Assistant")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello, $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ShizukuIAAssistantTheme {
        Greeting("Assistant")
    }
}