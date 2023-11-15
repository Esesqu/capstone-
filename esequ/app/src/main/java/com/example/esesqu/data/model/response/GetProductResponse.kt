package com.example.esesqu.data.model.response

import com.example.esesqu.data.model.Product


data class GetProductResponse(
    val message: String?,
    val products: List<Product>?,
    val status: Int?
)