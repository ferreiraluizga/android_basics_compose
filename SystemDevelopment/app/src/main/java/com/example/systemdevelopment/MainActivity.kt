package com.example.systemdevelopment

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.systemdevelopment.ui.theme.SystemDevelopmentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SystemDevelopmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SystemDevelopment(
                        text1 = stringResource(R.string.text1),
                        text2 = stringResource(R.string.text2)
                    )
                }
            }
        }
    }
}

@Composable
fun SystemDevelopmentText(text1: String, text2: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(
            text = text1,
            fontSize = 50.sp,
            fontWeight = FontWeight.SemiBold
        )
        Text(
            text = text2,
            fontSize = 35.sp,
            lineHeight = 40.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun SystemDevelopment(text1: String, text2: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.technology_image)
    Column {
        Image(
            painter = image,
            contentDescription = null
        )
        SystemDevelopmentText(
            text1 = text1,
            text2 = text2
        )
    }

}

@Preview(showBackground = true)
@Composable
fun SystemDevelopmentPreview() {
    SystemDevelopmentTheme {

    }
}