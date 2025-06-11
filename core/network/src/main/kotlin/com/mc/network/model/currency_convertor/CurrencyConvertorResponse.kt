package com.mc.network.model.currency_convertor

import kotlinx.serialization.Serializable

@Serializable
open class CurrencyConvertorResponse(
    val message: String? = null
)