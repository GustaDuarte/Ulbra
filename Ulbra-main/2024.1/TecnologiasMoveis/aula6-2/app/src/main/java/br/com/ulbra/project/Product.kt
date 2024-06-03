package br.com.ulbra.project

import java.io.Serializable

data class Product(
    var urlImage: String,
    val name: String,
    val price: String) : Serializable
