package com.pk.boma.ui.theme.screens.home

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.pk.boma.R
import com.pk.boma.navigation.ROUTE_LOGIN
import com.pk.boma.navigation.ROUTE_VIEW_PRODUCT
import android.content.Context
import android.view.LayoutInflater
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.pk.boma.navigation.ROUTE_VIEW_UPLOAD

@Composable
    fun HomeScreen(navController: NavHostController) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "Welcome to Boma!",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 30.sp
            )
            Spacer(modifier = Modifier.height(50.dp))

            Button(
                onClick = { navController.navigate(ROUTE_LOGIN) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Are you a home owner looking to publicise your property?")

            }
            Text(
                text = "OR",
                color = Color.White,
                fontFamily = FontFamily.Cursive,
                fontSize = 40.sp
            )
            Spacer(modifier = Modifier.height(50.dp))
            Button(
                onClick = { navController.navigate(ROUTE_VIEW_UPLOAD) },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Are you looking to find affordable housing near you?")

            }

        }

    }
@Preview
@Composable
fun Homeprev() {
    HomeScreen(rememberNavController())
}