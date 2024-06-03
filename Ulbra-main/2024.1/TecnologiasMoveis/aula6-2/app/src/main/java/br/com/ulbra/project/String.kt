package br.com.ulbra.project

fun String.convertToMoneyWithSymbol() = "R$ ".plus(this.replace(".", ","))