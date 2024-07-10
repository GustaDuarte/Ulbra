package br.com.ulbra.apicomretrofit.data.network.responses

import br.com.ulbra.apicomretrofit.data.Character
import com.google.gson.annotations.SerializedName

data class CharactersResponse(
    @SerializedName("name")
    val name: String,
    @SerializedName("height")
    val height: String,
    @SerializedName("mass")
    val mass: String,
    @SerializedName("hair_color")
    val hairColor: String,
    @SerializedName("skin_color")
    val skinColor: String,
    @SerializedName("eye_color")
    val eyeColor: String,
    @SerializedName("birth_year")
    val birthYear: String,
    @SerializedName("gender")
    val gender: String
)

fun CharactersResponse.toModel() = Character(
    name = this.name,
    height = this.height,
    mass = this.mass,
    hair_color = this.hairColor,
    skin_color = this.skinColor,
    eye_color = this.eyeColor,
    birth_year = this.birthYear,
    gender = this.gender
)