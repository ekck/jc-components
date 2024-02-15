package com.zanahtech.jccomponents

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zanahtech.jccomponents.ui.theme.GreenJC
import com.zanahtech.jccomponents.ui.theme.JccomponentsTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            JccomponentsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
//                    contentAlignment = Alignment.CenterStart
                ) {
//                    LearnTopAppBar()
//                    LearnState()
                    LearnNavDrawer()
                    
                }
            }
        }
    }
}

//@Composable
//fun LearnTextAndModifiers(){
//
//    val clickOnText = {}
//
//    Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
//
////    Text(text = stringResource(id = R.string.hello_text),
////        color = Color.Blue,
////        fontSize = 32.sp,
////        fontStyle = FontStyle.Italic,
////        modifier = Modifier
////            .padding(22.dp)
////            .background(Color.Black)
////            .clickable(onClick = clickOnText)
////    )
////        Text(text = "Hello Column 1")
////        Text(text = "Hello Column 2")
////}
////
////    Row (verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
////        Text(text = stringResource(id = R.string.hello_text),
////            color = Color.Blue,
////            fontSize = 32.sp,
////            fontStyle = FontStyle.Italic,
////            modifier = Modifier
////                .padding(22.dp)
////                .background(Color.Black)
////                .clickable(onClick = clickOnText)
////        )
////        Text(text = "Hello Column 1")
////        Text(text = "Hello Column 2")
////
////    }
//
//        Box(modifier = Modifier
//            .fillMaxSize()
//            .background(Color.Gray), contentAlignment = Alignment.Center){
//            Box(modifier = Modifier.height(300.dp).width(300.dp).background(Color.Blue) ){
//
//                Text(text = stringResource(id = R.string.hello_text),
//                    color = Color.White,
//                    fontSize = 30.sp,
//                    fontStyle = FontStyle.Italic,
//                    modifier = Modifier
//                        .align(Alignment.Center)
//                        .padding(22.dp)
//                        .background(Color.Black)
//                        .clickable(onClick = clickOnText)
//                )
//
//
//            }
//
//
//
//
//            }
//        }
//
//
//
//
//}

//Alignment = Cross Axis (Row = Vertical, Column = Horizontal)
//Arrangement = Main Axis (Row = Horizontal, Column = Vertical)

//@Composable
//fun LearnAlignmentArrangement(){
//
//    //RowAlignment: Top, CenterVertically, Bottom
//    //RowArrangement: Start, Center, End, SpaceBetween, SpaceAround, SpaceEvenly,
//            //Absolute.Left, Absolute.Right, Absolute.Center
//            //Absolute.SpaceBetween, Absolute.SpaceAround, Absolute.SpaceEvenly
////    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
////        Text(text = "Row Alignment Arrangement")
////    }
//
//   Box(contentAlignment = Alignment.BottomCenter){
//       Text(text = "text", modifier = Modifier.align(Alignment.Center))
//       Text(text = "text 2", modifier = Modifier.align(Alignment.TopCenter))
//       Text(text = "text3", modifier = Modifier.align(Alignment.TopEnd))
//       Text(text = "text4", modifier = Modifier.align(Alignment.TopStart))
//       Text(text = "text5", modifier = Modifier.align(Alignment.BottomEnd))
//       Text(text = "text6", modifier = Modifier.align(Alignment.CenterStart))
//       Text(text = "text8", modifier = Modifier.align(Alignment.CenterEnd))
//       Text(text = "text9", modifier = Modifier.align(Alignment.BottomStart))
//
//   }
//}

//
//
//@Composable
//fun LearnButton(){
//
//    val context = LocalContext.current.applicationContext
//
//    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
//        Button(onClick = { Toast.makeText(context, "Login successful", Toast.LENGTH_SHORT).show()},
//
//            shape = RoundedCornerShape(size = 16.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
//        ) {
//            Text(text = "Login")
//
//        }
//    }
//}
//
//@Composable
//fun LearnImage(){
//    val context = LocalContext.current.applicationContext
//
//    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
//        Image(painter = painterResource(id = R.drawable.work), contentDescription = "work in progress" )
//
//        Button(onClick = { Toast.makeText(context, "Login successful", Toast.LENGTH_SHORT).show()},
//
//            shape = RoundedCornerShape(size = 16.dp), colors = ButtonDefaults.buttonColors(containerColor = Color.Cyan)
//        ) {
//            Text(text = "Login")
//
//        }
//
//    }
//
//}
//
//@Composable
//fun LearnState(){
////    var age = 0
//    var age by remember {
//        mutableStateOf(0)
//    }
//
//
//    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
//        Button(onClick = { age++
//        Log.v("TAG", "age"+age)}) {
//            Text(text = "I am $age years old")
//
//
//        }
//    }
//}
//
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LearnTopAppBar(){
//
//    val context = LocalContext.current.applicationContext
//    TopAppBar(title = { Text(text = "WhatsApp")},
//        navigationIcon = {
//            IconButton(onClick = {Toast.makeText(context, "Whatsapp", Toast.LENGTH_SHORT).show()}) {
//                Icon(painter = painterResource(id = R.drawable.splash), contentDescription = "whatsapp icon")
//
//            }
//        }, colors = TopAppBarDefaults.topAppBarColors(
//            containerColor = GreenJC,
//            titleContentColor = Color.White,
//            navigationIconContentColor = Color.White
//        ), actions = {
//            IconButton(onClick = { Toast.makeText(context, "Profile", Toast.LENGTH_SHORT).show() }) {
//                Icon(imageVector = Icons.Filled.Person, contentDescription = "Profile", tint= Color.White)
//
//            }
//            IconButton(onClick = { Toast.makeText(context, "Search", Toast.LENGTH_SHORT).show() }) {
//                Icon(imageVector = Icons.Filled.Search, contentDescription = "Profile", tint= Color.White)
//
//            }
//            IconButton(onClick = { Toast.makeText(context, "Menu", Toast.LENGTH_SHORT).show() }) {
//                Icon(imageVector = Icons.Filled.MoreVert, contentDescription = "Profile", tint= Color.White)
//
//            }
//        }
//        )
//
//}
//
//@Preview
//@Composable
//fun TopAppBarPreview(){
//    LearnTopAppBar()
//}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnNavDrawer(){
    val navigationController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val context = LocalContext.current.applicationContext
    
    ModalNavigationDrawer(
         drawerState = drawerState,
        gesturesEnabled = true,
        drawerContent = { 
            ModalDrawerSheet {
                Box(modifier = Modifier
                    .background(GreenJC)
                    .fillMaxWidth()
                    .height(150.dp))
                { 
                    Text(text = "")
                }
                
                Divider()
                NavigationDrawerItem(label = { Text(text = "Home", color = GreenJC) },
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.Home, contentDescription = "Home", tint= GreenJC)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Home.screen){
                            popUpTo(0)
                        }
                    })

                NavigationDrawerItem(label = { Text(text = "Profile", color = GreenJC) },
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.AccountBox, contentDescription = "Profile", tint= GreenJC)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Profile.screen){
                            popUpTo(0)
                        }
                    })


                NavigationDrawerItem(label = { Text(text = "Settings", color = GreenJC) },
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.Settings, contentDescription = "Settings", tint= GreenJC)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                        navigationController.navigate(Screens.Settings.screen){
                            popUpTo(0)
                        }
                    })

                NavigationDrawerItem(label = { Text(text = "Logout", color = GreenJC) },
                    selected = false,
                    icon = { Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Logout", tint= GreenJC)},
                    onClick = {
                        coroutineScope.launch {
                            drawerState.close()
                        }
                       Toast.makeText(context, "Logout", Toast.LENGTH_SHORT).show()
                    })

                
            }
        }) {
        Scaffold (
            topBar = {
                val coroutineScope = rememberCoroutineScope()
                TopAppBar(title = { Text(text = "WhatsApp")},
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = GreenJC,
                        titleContentColor = Color.White,
                        navigationIconContentColor = Color.White
                    ),
                    navigationIcon = {
                        IconButton(onClick = {
                            coroutineScope.launch {
                                drawerState.open()
                            }
                        }) {
                            Icon(
                                Icons.Rounded.Menu, contentDescription = "MenuButton"
                            )
                        }
                    },
                    )

            }
        ) {
            NavHost(navController = navigationController,
                startDestination = Screens.Home.screen ){
                composable(Screens.Home.screen){ Home() }
                composable(Screens.Profile.screen){ Profile() }
                composable(Screens.Settings.screen){ Settings() }


            }

        }

        
    }
}