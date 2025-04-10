package com.blaise.icw.ui.theme.screens.web

import androidx.compose.foundation.BorderStroke
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
fun Web_Screen(navController: NavHostController) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Text(
            text = "Web Screen",
            fontSize = 40.sp,
            color = Color.Blue,
            fontFamily = FontFamily.Serif
        )

        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier.width(300.dp),
            border = BorderStroke(3.dp, Color.Magenta)
        ) {
            Text(
                text = "G", fontSize = 35.sp,
                fontFamily = FontFamily.Serif, color = Color.Blue
            )
            Text(
                text = "o", fontSize = 35.sp,
                fontFamily = FontFamily.Serif, color = Color.Red
            )
            Text(
                text = "o", fontSize = 35.sp,
                fontFamily = FontFamily.Serif, color = Color.Yellow
            )
            Text(
                text = "g", fontSize = 35.sp,
                fontFamily = FontFamily.Serif, color = Color.Blue
            )
            Text(
                text = "l", fontSize = 35.sp,
                fontFamily = FontFamily.Serif, color = Color.Green
            )
            Text(
                text = "e", fontSize = 35.sp,
                fontFamily = FontFamily.Serif, color = Color.Red
            )
        }
    }
}

@Preview
@Composable
private fun WebPreview() {
    Web_Screen(rememberNavController())
}