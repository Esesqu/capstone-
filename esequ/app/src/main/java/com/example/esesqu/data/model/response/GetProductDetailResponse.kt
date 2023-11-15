package com.example.esesqu.data.model.response


import com.example.esesqu.data.model.Product

data class GetProductDetailResponse(
    val message: String?,
    val product: Product,
    val status: Int?
)