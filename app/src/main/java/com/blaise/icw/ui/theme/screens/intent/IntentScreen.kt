package com.blaise.icw.ui.theme.screens.intent

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun Intent_Screen(navController: NavHostController) {
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)){
        Text(text = "Intent Screen",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Serif)

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)
        ) {
            Text(text = "Call",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "STK",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "Dial",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(
                text = "Share",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black
            )
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "Email",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "Camera",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp)) {
            Text(text = "SMS",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.Black)
        }
        
    }
}

@Preview
@Composable
private fun IntentPreview() {
    Intent_Screen(rememberNavController())
}