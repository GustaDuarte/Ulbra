package br.com.ulbra.exemplorecycler.di

import android.content.Context
import androidx.room.Room
import br.com.ulbra.exemplorecycler.data.Product
import br.com.ulbra.exemplorecycler.data.database.ProductDao
import br.com.ulbra.exemplorecycler.data.database.ProductDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext context: Context): ProductDatabase {
        return Room.databaseBuilder(context, ProductDatabase::class.java, "aula")
            .fallbackToDestructiveMigration().build()
    }


    @Provides
    @Singleton
    fun provideProductDaoService(appDatabase: ProductDatabase): ProductDao {
        return appDatabase.productDao()
    }
}