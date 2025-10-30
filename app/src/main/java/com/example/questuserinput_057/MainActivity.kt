package com.example.questuserinput_057

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.questuserinput_057.ui.theme.QuestUserInput_057Theme
// Import ini akan bekerja setelah Anda membuat file FormDataDiri.kt
import com.example.questuserinput_057.FormDataDiri

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestUserInput_057Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Sekarang pemanggilan ini akan menjadi valid
                    FormDataDiri(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}
