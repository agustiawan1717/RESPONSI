package com.agustiawan.demoproject

import java.io.Serializable

data class SalePrice(

    var amount: Float,
    var currency: String
) : Serializable