package br.com.ulbra.apicomretrofit.data.network.responses

import com.google.gson.annotations.SerializedName

data class CharactersResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String
)

fun CharactersResponse.toModel() = DemonSlayerCharacter(
    name = this.name,
    image = this.image
)
