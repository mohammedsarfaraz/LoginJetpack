package com.example.loginscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun MyLogin(navController: NavController){

    val name = remember {
        mutableStateOf("")
    }

    val password = remember {
        mutableStateOf("")
    }
    Scaffold(backgroundColor = Color.Black) {


        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {
            Spacer(modifier = Modifier.padding(top = 70.dp))

            Card(
//                modifier = Modifier.weight(1f),
                shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp)

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
                        .padding(top = 30.dp, start = 15.dp)
                ) {



                    Button(onClick = { /*TODO*/ }
                        , shape = RoundedCornerShape(50)
                        , modifier = Modifier.size(45.dp)
                        , colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
                    {

                        Image(painter = painterResource(id = R.drawable.ic_baseline_clear_24), contentDescription ="",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.Crop,

                            )
                    }

//
                    Text(
                        text = "Welcome",
                        fontSize = 40.sp,
                        modifier = Modifier.padding(start = 15.dp, top = 50.dp),
                        fontWeight = FontWeight.ExtraBold)

                    Text(
                        text = "Back",
                        fontSize = 40.sp,
                        modifier = Modifier.padding(start = 15.dp),
                        fontWeight = FontWeight.ExtraBold)


                    TextField(value = name.value,
                        onValueChange = { name.value = it },
                        modifier = Modifier
                            .padding(top = 30.dp, start = 10.dp, end = 10.dp)
                            .fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = Color.White),
                        placeholder = {
                            Text(text = "UserName") })


                    TextField(value = password.value,
                        onValueChange = { password.value = it },
                        modifier = Modifier
                            .padding(top = 20.dp, start = 10.dp, end = 10.dp)
                            .fillMaxWidth(),
                        colors = TextFieldDefaults.textFieldColors(
                            backgroundColor = Color.White),
                        placeholder = {
                            Text(text = "Password") })

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp, start = 10.dp, end = 35.dp)
                        ,Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically) {

                        Text(
                            text = "Sign in",
                            style = TextStyle(
                                fontSize = 24.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Bold),)

                        Button(onClick = { navController.navigate("Dashboard"){
                            popUpTo = navController.graph.startDestinationId
                            launchSingleTop = true

                        } }
                            , shape = CircleShape
                            , modifier = Modifier.size(70.dp)
                            , colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFFED9121)))
                        {

                            Image(painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_right_24), contentDescription ="",
                                modifier = Modifier
                                    .fillMaxSize(),
                                colorFilter = ColorFilter.tint(MaterialTheme.colors.secondary))
                        }
                    }

//
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 50.dp),
                        Arrangement.SpaceAround) {

                        Button(onClick = { /*TODO*/ }
                            , shape = CircleShape
                            , modifier = Modifier.size(65.dp)
                            , colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
                        {

                            Image(painter = painterResource(id = R.drawable.gogle), contentDescription = "",
                                modifier = Modifier
                                    .fillMaxSize()
                                    .clip(CircleShape),
                                contentScale = ContentScale.Crop,)
//
                        }

                        Button(onClick = { /*TODO*/ }
                            , shape = CircleShape
                            , modifier = Modifier.size(65.dp)
                            , colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
                        {

                            Image(painter = painterResource(id = R.drawable.apple), contentDescription = "", modifier =
                            Modifier
                                .fillMaxSize()
                                .clip(CircleShape),
                                contentScale = ContentScale.Crop,)
//
                        }
                        Button(onClick = { /*TODO*/ }
                            , shape = CircleShape
                            , modifier = Modifier.size(65.dp)
                            , colors = ButtonDefaults.buttonColors(backgroundColor = Color.White))
                        {

                            Image(painter = painterResource(id = R.drawable.facebook_wide), contentDescription = "", modifier =
                            Modifier
                                .size(35.dp)
                                .clip(CircleShape),
                                contentScale = ContentScale.Crop,)
//

                        }
                    }

                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 70.dp, start = 15.dp, end = 20.dp)
                        ,Arrangement.SpaceBetween)
                    {
                        Text(text = "Sign up",
                            style = TextStyle(fontStyle = FontStyle.Normal
                                , fontWeight = FontWeight.Bold
                                , fontSize = 20.sp
                            )
                        )

                        Text(text = "ForgotPassword?",
                            style = TextStyle(fontStyle = FontStyle.Normal
                                , fontSize = 17.sp)

                        )
                    }

                }

            }
        }

}}