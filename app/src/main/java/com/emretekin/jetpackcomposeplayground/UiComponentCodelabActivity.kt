package com.emretekin.jetpackcomposeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class UiComponentCodelabActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Column {
                    DrawableImage()
                    Greeting("Android")
                    Row(modifier = Modifier.padding(16.dp)) {
                        IconImage()
                        IconImage()
                        IconImage()
                        IconImage()
                        IconImage()
                    }
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String) {
        Text(text = "Hello $name!")
    }

    @Preview
    @Composable
    fun DefaultPreview() {
        MaterialTheme {
            Greeting("Android")
        }
    }


    @Composable
    fun GreetingDetails(name: String) {
        val longText = "The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog. The quick brown fox jumps over the lazy dog."
        Text(
            text = "Hello $name!\n$longText",  // longText in next line
            modifier = Modifier.padding(16.dp),
            color = Color.Red,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline,
            textAlign = TextAlign.Start,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            maxLines = 2,
            onTextLayout = { textLayoutResult: TextLayoutResult ->
                //Callback that is executed when a new text layout is calculated.
            },
            style = TextStyle.Default
        )
    }

    @Preview
    @Composable
    fun DrawableImage() {
        val imageModifier = Modifier
            .padding(16.dp)
            .wrapContentWidth()
            .clip(shape = RoundedCornerShape(8.dp))

        Image(
            painterResource(R.drawable.cover),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = imageModifier
        )
    }

    @Preview
    @Composable
    fun IconImage() {
        Image(
            painterResource(R.drawable.cover),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.size(40.dp, 40.dp)
        )
    }

    @Composable
    fun NoteColor() {
        Box(
            modifier = Modifier
                .size(40.dp)
                .background(Color.Red)
                .clip(CircleShape) // here
        )
    }


    @Composable
    fun CardAndImage() {
        Card(
            modifier = Modifier.size(48.dp),
            shape = CircleShape,
            elevation = 4.dp
        ) {
            Image(
                painterResource(R.drawable.cover),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }
    }

    @Composable
    fun VerticalLayout() {
        Column {
            DrawableImage()
            Greeting("Android")
        }
    }


    @Composable
    fun VerticalLayoutPreview() {
        MaterialTheme {
            VerticalLayout()
        }
    }

    @Composable
    fun HorizontalLayout() {
        Row {
            IconImage()
            IconImage()
            IconImage()
            IconImage()
            IconImage()
        }
    }

    @Composable
    fun CombineLayout() {
        Column {
            DrawableImage()
            Greeting("Android")
            Row(modifier = Modifier.padding(16.dp)) {
                IconImage()
                IconImage()
                IconImage()
                IconImage()
                IconImage()
            }
        }
    }

    @Preview
    @Composable
    fun CombineLayoutPreview() {
        MaterialTheme {
            CombineLayout()
        }
    }






}