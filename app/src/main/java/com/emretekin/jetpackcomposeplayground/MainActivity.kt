package com.emretekin.jetpackcomposeplayground

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //SayHello(name = "Emre Tekin")
            //MessageCard()
            MessageCardModifier()
        }
    }

    @Composable
    fun SayHello(name: String){
        Button(onClick = { onButtonClick(name) }) {
            Text(text = "Show Toast")
        }
    }

    val onButtonClick: (String) -> Unit = {name ->
        Toast.makeText(applicationContext, "Saying Hello to $name", Toast.LENGTH_SHORT).show()
    }


    @Preview
    @Composable
    fun MessageCard() {
        Column {
            Text(text = "Message Received")
            Row {
                Text(text = "Tuesday")
                Text(text = "3:09 pm")
            }
        }
    }

    @Composable
    fun MessageCardModifier() {
        Column{
            Text(text = "Message Received")
            Row{
                Text(text = "Tuesday")
                Text(
                    text = "3:09 pm",
                    modifier = Modifier.padding(start = 8.dp)
                )
            }
        }
    }
}