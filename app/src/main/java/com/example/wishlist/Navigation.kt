package com.example.wishlist

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import eu.tutorials.mywishlistapp.AddEditDetailView

@Composable
fun Navigation(viewModel: WishViewModel= viewModel(),navHostController: NavHostController= rememberNavController()){
    NavHost(navController = navHostController, startDestination = Screen.HomeScreen.route){
        composable(Screen.HomeScreen.route){
            HomeView(navHostController,viewModel)
        }
        composable(Screen.AddScreen.route+ "/{id}",
            arguments= listOf(
                navArgument("id"){
                    type= NavType.LongType
                    defaultValue= 0L
                    nullable=false
                }

            )
        ){entry->
            val id=if(entry.arguments!=null) entry.arguments!!.getLong("id") else 0L
            AddEditDetailView(id,viewModel,navHostController)
        }
    }
}