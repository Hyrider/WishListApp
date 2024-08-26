package com.example.wishlist

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource

@Composable
fun AppBarView(title: String, onBackNavClicked: (() -> Unit)?){
    val navigationIcon:(@Composable ()->Unit)?
    if(!title.contains("WishList"))
    {
       navigationIcon=
        {

            IconButton(onClick = { onBackNavClicked })
            {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    tint = Color.White,
                    contentDescription = null
                )
            }
        }
    }else{
        navigationIcon=null
    }
            TopAppBar(
        title ={ Text(text = title, color = Color.White)},
        backgroundColor = colorResource(id = R.color.black),
        navigationIcon = navigationIcon)
        }