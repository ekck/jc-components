package com.zanahtech.jccomponents

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.zanahtech.jccomponents.ui.theme.JccomponentsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            JccomponentsTheme {
                // A surface container using the 'background' color from the theme
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    LearnTextAndModifiers()
                    
                }
            }
        }
    }
}

@Composable
fun LearnTextAndModifiers(){

    val clickOnText = {}
    
    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {

//    Text(text = stringResource(id = R.string.hello_text),
//        color = Color.Blue,
//        fontSize = 32.sp,
//        fontStyle = FontStyle.Italic,
//        modifier = Modifier
//            .padding(22.dp)
//            .background(Color.Black)
//            .clickable(onClick = clickOnText)
//    )
//        Text(text = "Hello Column 1")
//        Text(text = "Hello Column 2")
//}
//
//    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
//        Text(text = stringResource(id = R.string.hello_text),
//            color = Color.Blue,
//            fontSize = 32.sp,
//            fontStyle = FontStyle.Italic,
//            modifier = Modifier
//                .padding(22.dp)
//                .background(Color.Black)
//                .clickable(onClick = clickOnText)
//        )
//        Text(text = "Hello Column 1")
//        Text(text = "Hello Column 2")
//
//    }

        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray), contentAlignment = Alignment.Center){
            Box(modifier = Modifier.height(300.dp).width(300.dp).background(Color.Blue) ){

                Text(text = stringResource(id = R.string.hello_text),
                    color = Color.White,
                    fontSize = 30.sp,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(22.dp)
                        .background(Color.Black)
                        .clickable(onClick = clickOnText)
                )


            }




            }
        }




}



