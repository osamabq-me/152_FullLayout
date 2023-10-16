package com.example.notatrial

import android.graphics.Color
import android.graphics.Paint.Align
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.text.font.FontWeight.Companion.ExtraBold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.notatrial.ui.theme.NotatrialTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NotatrialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Main(){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(20.dp),horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Osamah Al-mekhlafi",
            fontWeight = Bold,
            fontSize = 36.sp,
        )
        status()
        center(degree = "20", city = "Yogyakarta")
        end()

    }
}

@Composable
fun status(){
        Box(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(15.dp))
            .background(androidx.compose.ui.graphics.Color.Cyan)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center, // Center vertically
                horizontalAlignment = Alignment.CenterHorizontally // Center horizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = "RAIN",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .height(250.dp)
                        .width(200.dp)
                )
                Text(text = "Rain",
                    fontWeight = Bold,
                    fontSize = 20.sp,
                    modifier = Modifier.padding(15.dp))
            }
        }
}


@Composable
fun center(degree: String, city:String){
    Text(text = "$degree°C", fontSize = 80.sp, fontWeight = ExtraBold)
    Spacer(modifier = Modifier.padding(5.dp))

    Row {
        Image(painter = painterResource(id = R.drawable.baseline_location_on_24),
            contentDescription ="Supposed to be Icon of the locaiton")
        Text(text = "$city",fontSize = 40.sp, fontWeight = Bold)
    }
    Spacer(modifier = Modifier.padding(10.dp))
    Text(text = "  Kasihan,Kabupaten Bantul,\n Daerah Istimewa Yogyakarta", fontSize = 15.sp, color = androidx.compose.ui.graphics.Color.Gray)
    Spacer(modifier = Modifier.padding(10.dp))
}

@Composable
fun end(){
    Card (modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .clip(RoundedCornerShape(13.dp))
    ) {
        Column (modifier = Modifier.padding(5.dp).align(alignment = Alignment.CenterHorizontally)
           ){
            Row {
                Column {
                    Text(text = "Humidity", fontSize = 20.sp)
                    Text(text = "  98%", fontWeight = ExtraBold,fontSize = 30.sp)
                }
                Spacer(modifier = Modifier.padding(40.dp))
                Column {
                    Text(text = "UV Index", fontSize = 20.sp)
                    Text(text = "  98%", fontWeight = ExtraBold,fontSize = 30.sp)
                }
            }
            Row {
                Column {
                    Text(text = "Humidity", fontSize = 20.sp)
                    Text(text = "   98%", fontWeight = ExtraBold,fontSize = 30.sp)
                }
                Spacer(modifier = Modifier.padding(40.dp))
                Column {
                    Text(text = "Humidity", fontSize = 20.sp)
                    Text(text = "  98%", fontWeight = ExtraBold,fontSize = 30.sp)
                }
            }
            Spacer(modifier = Modifier.padding(40.dp))
        }
    }
}




@Composable
@Preview(showBackground = true)
fun GreetingPreview() {
    NotatrialTheme {
        Main()

    }
}