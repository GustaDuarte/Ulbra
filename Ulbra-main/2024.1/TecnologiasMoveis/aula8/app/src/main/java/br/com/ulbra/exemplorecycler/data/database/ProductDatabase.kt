package br.com.ulbra.exemplorecycler.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ProductEntity::class], version = 2, exportSchema = true)
abstract class ProductDatabase : RoomDatabase() {
    abstract fun productDao(): ProductDao
}