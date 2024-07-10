package br.com.ulbra.exemplorecycler.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ProductDao {
    @Query("Select * from products")
    fun fetchProducts(): List<ProductEntity>

    @Insert
    suspend fun insertProduct(productEntity: ProductEntity)
}