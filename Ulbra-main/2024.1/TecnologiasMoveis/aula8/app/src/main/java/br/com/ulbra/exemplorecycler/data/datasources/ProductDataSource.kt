package br.com.ulbra.exemplorecycler.data.datasources

import br.com.ulbra.exemplorecycler.data.database.ProductDao
import br.com.ulbra.exemplorecycler.data.database.ProductEntity
import javax.inject.Inject

class ProductDataSource @Inject constructor(private val productDao: ProductDao) {
    fun fetchProducts(): List<ProductEntity> {
        return productDao.fetchProducts()
    }

    suspend fun insertProduct(product: ProductEntity) {
        productDao.insertProduct(product)
    }

}