package com.example.examen_di

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examen_di.ui.theme.ExamenDITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenDITheme {

            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun App() {
    ExamenDITheme {
        Column(
            Modifier.background(Color.Cyan).fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp, end = 40.dp, start = 40.dp)
                    .fillMaxHeight(0.33f),
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxHeight()
                        .fillMaxWidth(0.5f),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text("Hello Android!", modifier = Modifier.background(Color.Red))
                }
                Column(
                    modifier = Modifier
                        .background(Color.Gray)
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center

                ) {
                    Text("Hello Android!", modifier = Modifier.background(Color.Red))
                    Text("Hello Android!", modifier = Modifier.background(Color.Red))
                    Text("Hello Android!", modifier = Modifier.background(Color.Red))
                }
            }
            Row(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth(0.5f)
                    .fillMaxHeight(0.33f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("Hello Android!")
            }
            Row (
                modifier = Modifier.padding(bottom = 40.dp, end = 40.dp, start = 40.dp)
            ) {
                Column (
                    modifier = Modifier.background(Color.Green)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row {
                         Button(onClick = {},
                             modifier = Modifier.background(Color.Blue).size(60.dp)
                         )  {
                            Text("1")
                         }
                    }
                    Row {
                        Button(onClick = {},
                            modifier = Modifier.background(Color.Blue).size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                    Row {
                        Button(onClick = {},
                            modifier = Modifier.background(Color.Blue).size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                }
                Column (
                    modifier = Modifier.background(Color.Green)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row (
                        modifier = Modifier.fillMaxWidth()
                            .background(Color.Magenta),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(onClick = {},
                            modifier = Modifier.size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                    Row (
                        modifier = Modifier.fillMaxWidth()
                            .background(Color.Magenta),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(onClick = {},
                            modifier = Modifier.size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                    Row (
                        modifier = Modifier.fillMaxWidth()
                            .background(Color.Magenta),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Button(onClick = {},
                            modifier = Modifier.size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                }
                Column (
                    modifier = Modifier.background(Color.Green)
                        .weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row {
                        Button(onClick = {},
                            modifier = Modifier.background(Color.Black).size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                    Row {
                        Button(onClick = {},
                            modifier = Modifier.background(Color.Black).size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                    Row {
                        Button(onClick = {},
                            modifier = Modifier.background(Color.Black).size(60.dp)
                        )  {
                            Text("1")
                        }
                    }
                }
            }
        }
    }
}