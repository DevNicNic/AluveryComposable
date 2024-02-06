package com.nicnicdev.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.nicnicdev.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    CustomLayoutPreview()


                }
            }


        }
    }
}


@Preview(showBackground = true)
@Composable
fun ColumnPreview() {
    Column {
        Text(text = "Texto 1")
        Text(text = "Texto 2")
    }
}

@Preview(showBackground = true)
@Composable
fun RowPreview() {
    Row {
        Text(text = "Texto 3")
        Text(text = "Texto 4")
    }

}

@Preview(showBackground = true)
@Composable
fun BoxPreview() {
    Box {
        Text(text = "Texto 5")
        Text(text = "Texto 6")
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CustomLayoutPreview() {
    Column(
        modifier = Modifier
            .padding(all = 8.dp)
            .background(color = Color.Blue)
            .padding(all = 8.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Text(text = "Texto 7")
        Text(text = "Texto 9")
        Row(
            modifier = Modifier
                .padding(
                    horizontal = 8.dp,
                    vertical = 16.dp
                )
                .background(color = Color.Green)
                .fillMaxWidth(0.9f)
        ) {
            Text(text = "Texto 10")
            Text(text = "Texto 11")
        }
        Box(
            modifier = Modifier
                .padding(all = 8.dp)
                .background(color = Color.Red)
                .padding(all = 8.dp)
        ) {
            Row(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .background(color = Color.Cyan)
                    .padding(all = 8.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "Texto 12")
                Text(text = "Texto 13")
            }
            Column(
                modifier = Modifier
                    .padding(all = 8.dp)
                    .background(color = Color.Yellow)
                    .padding(all = 8.dp)
            ) {
                Text(text = "Texto 14")
                Text(text = "Texto 15")
            }


        }
    }


}

@Composable
fun MyFistComposable() {
    Text(text = "Meu primeiro texto")
    Text(text = "Meu segundo texto maior")

}


@Preview(showBackground = true)
@Composable
fun MyFirstComposablePreview() {
    MyFistComposable()

}