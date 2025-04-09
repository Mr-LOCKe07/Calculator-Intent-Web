package com.blaise.icw.ui.theme.screens.calc

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calc_Screen(modifier: Modifier = Modifier) {
    var firstnum by remember { mutableStateOf(TextFieldValue("")) }
    var secondnum by remember { mutableStateOf(TextFieldValue("")) }


    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ){

        Text(text = "Answer here!!!",
            color = Color.Green,
            fontSize = 30.sp,
            fontFamily = FontFamily.Monospace)

        OutlinedTextField(value = firstnum,
            onValueChange = {firstnum=it},
            label = {Text(text = "Enter First No.",
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White)},
            shape = RoundedCornerShape(20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.padding(16.dp)
        )

        OutlinedTextField(value = secondnum,
            onValueChange = {secondnum=it},
            label = {Text(text = "Enter Second No.",
                fontSize = 30.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White)},
            shape = RoundedCornerShape(20.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.padding(16.dp)
        )

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier.width(300.dp),
            border = BorderStroke(3.dp, Color.Blue)) {
            Text(text = "+",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier.width(300.dp),
            border = BorderStroke(3.dp, Color.Red)
        ) {
            Text(text = "-",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier.width(300.dp),
            border = BorderStroke(3.dp, Color.Magenta)) {
            Text(text = "*",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White)
        }

        OutlinedButton(onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Transparent),
            modifier = Modifier.width(300.dp),
            border = BorderStroke(3.dp, Color.Yellow)) {
            Text(text = "/",
                fontSize = 35.sp,
                fontFamily = FontFamily.Serif,
                color = Color.White)
        }
    }
}

@Preview
@Composable
private fun CalcPreview() {
    Calc_Screen()
}