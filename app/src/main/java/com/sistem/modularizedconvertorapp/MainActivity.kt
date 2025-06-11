package com.sistem.modularizedconvertorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

import com.mc.designsystem.theme.MoneyConvertorTheme
import javax.inject.Inject
import com.mc.network.service.CurrencyService
import com.sistem.modularizedconvertorapp.navigation.MoneyConvertorNavGraph
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var currencyService: CurrencyService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        enableEdgeToEdge()
        setContent {
            MoneyConvertorTheme {
                MoneyConvertorNavGraph()
            }
        }
    }
}
