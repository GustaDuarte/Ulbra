package br.com.ulbra.exemplorecycler.data.repositories

import br.com.ulbra.exemplorecycler.data.Product
import br.com.ulbra.exemplorecycler.data.convertToEntity
import br.com.ulbra.exemplorecycler.data.database.convertToModel
import br.com.ulbra.exemplorecycler.data.datasources.ProductDataSource
import javax.inject.Inject

class ProductRepository @Inject constructor(
    private val productDataSource: ProductDataSource
) {
    fun fetchProducts(): List<Product> {
        return productDataSource.fetchProducts().map { item -> item.convertToModel() }
    }

    suspend fun insertProduct(product: Product) {
        productDataSource.insertProduct(product = product.convertToEntity())
    }
}