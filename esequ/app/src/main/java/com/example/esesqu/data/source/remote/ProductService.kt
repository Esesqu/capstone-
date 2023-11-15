package com.example.esesqu.data.source.remote


import com.example.esesqu.common.Constants.Endpoint.ADD_TO_CART
import com.example.esesqu.common.Constants.Endpoint.CLEAR_CART
import com.example.esesqu.common.Constants.Endpoint.DELETE_FROM_CART
import com.example.esesqu.common.Constants.Endpoint.GET_ALL_PRODUCTS
import com.example.esesqu.common.Constants.Endpoint.GET_CART_PRODUCTS
import com.example.esesqu.common.Constants.Endpoint.GET_PRODUCT_DETAIL
import com.example.esesqu.common.Constants.Endpoint.GET_SALE_PRODUCTS
import com.example.esesqu.common.Constants.Endpoint.SEARCH_PRODUCT
import com.example.esesqu.data.model.request.AddToCartRequest
import com.example.esesqu.data.model.request.ClearCartRequest
import com.example.esesqu.data.model.request.DeleteFromCartRequest
import com.example.esesqu.data.model.response.CRUDResponse
import com.example.esesqu.data.model.response.GetCartProductsResponse
import com.example.esesqu.data.model.response.GetProductDetailResponse
import com.example.esesqu.data.model.response.GetProductResponse
import com.example.esesqu.data.model.response.GetSaleProductResponse
import com.example.esesqu.data.model.response.GetSearchProductResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Query



interface ProductService {

    @Headers("store:esequ")
    @GET(GET_ALL_PRODUCTS)
    suspend fun getAllProducts(): GetProductResponse

    @Headers("store:esequ")
    @GET(GET_PRODUCT_DETAIL)
    suspend fun getProductDetail(
        @Query("id") id: Int
    ): GetProductDetailResponse

    @Headers("store:esequ")
    @GET(GET_SALE_PRODUCTS)
    suspend fun getSaleProducts(): GetSaleProductResponse

    @Headers("store:esequ")
    @GET(SEARCH_PRODUCT)
    suspend fun getSearchProduct(
        @Query("query") query: String
    ): GetSearchProductResponse

    @Headers("store:esequ")
    @POST(ADD_TO_CART)
    suspend fun addToCart(
        @Body addToCartRequest: AddToCartRequest
    ): CRUDResponse

    @Headers("store:esequ")
    @GET(GET_CART_PRODUCTS)
    suspend fun getCartProducts(
        @Query("userId") userId: String
    ): GetCartProductsResponse

    @Headers("store:esequ")
    @POST(DELETE_FROM_CART)
    suspend fun deleteFromCart(
        @Body deleteFromCartRequest: DeleteFromCartRequest
    ): CRUDResponse

    @Headers("store:esequ")
    @POST(CLEAR_CART)
    suspend fun clearCart(
        @Body clearCartRequest: ClearCartRequest
    ) : CRUDResponse

}