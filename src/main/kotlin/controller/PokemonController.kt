package controller

import models.Pokemon
import models.PokemonType
import java.io.File
//import utils.*
import java.io.FileInputStream
import java.io.ObjectInputStream

val file: File = File("./files/pokemon.csv")

fun crearPokemons(): MutableList<Pokemon> {
    val llistaPokemons: MutableList<Pokemon> = mutableListOf()
    var pokemonsLines = file.readLines()
    for (i in 1 until pokemonsLines.size) {
        var llistaAtributs = pokemonsLines[i].split(",")
        var number: Int = llistaAtributs[0].toInt()
        var name: String = llistaAtributs[1]
        var type1: PokemonType = pokemonType(llistaAtributs[2])
        var type2: PokemonType = pokemonType(llistaAtributs[3])
        var attack: Int = llistaAtributs[4].toInt()
        var defense: Int = llistaAtributs[5].toInt()
        var experienceType: String = llistaAtributs[6]
        var finalEvolution: Boolean = llistaAtributs[7].toBoolean()
        var catchRate: Int = llistaAtributs[8].toInt()
        var legendary: Boolean = llistaAtributs[9].toBoolean()
        var height: Double = llistaAtributs[10].toDouble()
        var weight: Double = llistaAtributs[11].toDouble()

        var pokemon: Pokemon = Pokemon(number,name, type1,type2,attack,defense,experienceType,finalEvolution,catchRate,legendary,height,weight)
        llistaPokemons.add(pokemon)
    }
    return llistaPokemons
}

fun main() {

    var llistaPokemons = crearPokemons()
    for (pokemon in llistaPokemons) {
        println(pokemon)
    }
}

    fun pokemonType(type: String): PokemonType {
        var pokemonType: PokemonType
        when(type.lowercase()) {
            "bug" -> pokemonType = PokemonType.BUG
            "dark" -> pokemonType = PokemonType.DARK
            "dragon" -> pokemonType = PokemonType.DRAGON
            "electric" -> pokemonType = PokemonType.ELECTRIC
            "fairy" -> pokemonType = PokemonType.FAIRY
            "fighting" -> pokemonType = PokemonType.FIGHTING
            "fire" -> pokemonType = PokemonType.FIRE
            "flying" -> pokemonType = PokemonType.FLYING
            "ghost" -> pokemonType = PokemonType.GHOST
            "grass" -> pokemonType = PokemonType.GRASS
            "ground" -> pokemonType = PokemonType.GROUND
            "ice" -> pokemonType = PokemonType.ICE
            "normal" -> pokemonType = PokemonType.NORMAL
            "poison" -> pokemonType = PokemonType.POISON
            "psychic" -> pokemonType = PokemonType.PSYCHIC
            "rock" -> pokemonType = PokemonType.ROCK
            "steel" -> pokemonType = PokemonType.STEEL
            "water" -> pokemonType = PokemonType.WATER
            "" -> pokemonType = PokemonType.N_A
            else -> pokemonType = PokemonType.N_A
        }
        return pokemonType
    }



fun importarPokemons(): MutableList<Pokemon> {
    if (file.exists()) {
        ObjectInputStream(FileInputStream(file)).use { ois ->
            return ois.readObject() as MutableList<Pokemon>
        }
    } else return mutableListOf()
}
