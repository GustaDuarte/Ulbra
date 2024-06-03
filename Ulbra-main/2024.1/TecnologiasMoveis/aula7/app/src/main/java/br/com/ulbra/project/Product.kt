package br.com.ulbra.project

import java.io.Serializable

//representa os dados do produto
data class Product(
    var urlImage: String,
    val name: String,
    val price: String) : Serializable // dados -> sejam passados entre atividades e fragmentos
