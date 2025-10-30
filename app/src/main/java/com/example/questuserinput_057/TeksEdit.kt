package com.example.questuserinput_057

import androidx.compose.runtime.Composable
import android.R
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember {mutableStateOf(value="")}
    var textAlamat by remember {mutableStateOf(value="")}
    var textJK by remember {mutableStateOf(value="")}

    var nama by remember {mutableStateOf(value="")}
    var alamat by remember {mutableStateOf(value="")}
    var jenis by remember {mutableStateOf(value="")}

    val gender:List<R.string> = listOf("Laki-laki","Perempuan")

    comlumn(modifier = modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally {
            OutlinedTextField(
                value = textNama,
                singleLine = true,
                shape = MaterialTheme.shapes.large,
                modifier = Modifier.width(250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {textNama = it}
            )
            Row {
                gender.forEach { item ->
                    

                }
            }


        }




