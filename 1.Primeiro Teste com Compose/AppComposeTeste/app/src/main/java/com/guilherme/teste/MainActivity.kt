package com.guilherme.teste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.guilherme.teste.ui.theme.AppComposeTesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppComposeTesteTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Card("Logo do Compose...")
                }
            }
        }
    }

    @Preview
    @Composable
    fun CardPreview(){
        AppComposeTesteTheme {
            Surface(modifier = Modifier.fillMaxSize()) {
                Card("Logo do Compose...")
            }
        }
    }

    @Composable
    fun Card(titulo : String) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.compose),
                contentDescription = "Logo do Compose",
                modifier = Modifier.size(40.dp)
            )

            Column {

                Text(
                    text = "$titulo",
                    fontSize = 20.sp,
                    color = Color(88, 88, 88, 255)
                )
                Text(
                    "Texto 1...",
                    color = Color(88, 88, 88, 255)
                )
                Text(
                    "Texto 2...",
                    color = Color(88, 88, 88, 255)
                )
            }
        }
    }
}