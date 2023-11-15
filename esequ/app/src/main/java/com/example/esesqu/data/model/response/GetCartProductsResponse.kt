package com.example.esesqu.data.model.response


import com.example.esesqu.data.model.Product

data class GetCartProductsResponse(
    val message: String?,
    val products: List<Product>?,
    val status: Int?
)