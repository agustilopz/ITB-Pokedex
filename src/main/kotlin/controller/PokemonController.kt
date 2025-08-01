package controller

import models.Pokemon
import models.PokemonType
import java.io.File
//import utils.*
import java.io.FileInputStream
import java.io.ObjectInputStream

val file: File = File("./files/pokemon.csv")

/**
 * Funció per crear una llista de Pokémons a partir del fitxer CSV.
 * Procesa el contingut del fitxer, canviant les comes dins dels corxetes per punt i coma.
 * Un cop processat, crea instàncies de la classe Pokemon amb els atributs corresponents.
 *
 * @return Una llista mutable de Pokémons creats.
 * @since 03/03/03
 */
fun crearPokemons(): MutableList<Pokemon> {
    // Expressió regular per trobar les comes dins dels corxetes [ ]
    val regex = "\\[([^\\]]*)\\]".toRegex()

    // Reemplaçar les comes per punt i coma
    val contingutLlistaProcessat = file.readText().replace(regex) { match ->
        match.value.replace(",", ";")
    }

    file.writeText(contingutLlistaProcessat)

    val llistaPokemons: MutableList<Pokemon> = mutableListOf()
    file.readText()
    var pokemonsLines = file.readLines()
    for (i in 1 until pokemonsLines.size) {
        var llistaAtributs = pokemonsLines[i].split(",")
        var number: Int = llistaAtributs[0].toInt()
        var name: String = llistaAtributs[1]
        var type1: PokemonType = pokemonType(llistaAtributs[2])
        var type2: PokemonType = pokemonType(llistaAtributs[3])
        var abilities: MutableList<String> =
            llistaAtributs[4].replace("[", "").replace("]", "").replace("'", "").replace("\"", "").split("; ")
                .toMutableList()
        var hp: Int = llistaAtributs[5].toInt()

        var attack: Int = llistaAtributs[6].toInt()
        var defense: Int = llistaAtributs[7].toInt()

        var spAtk: Int = llistaAtributs[8].toInt()
        var spDef: Int = llistaAtributs[9].toInt()
        var speed: Int = llistaAtributs[10].toInt()


        var experienceType: String = llistaAtributs[15]
        var finalEvolution: Boolean = llistaAtributs[17].toBoolean()
        var catchRate: Int = llistaAtributs[18].toInt()
        var legendary: Boolean = llistaAtributs[19].toBoolean()
        var height: Double = llistaAtributs[41].toDouble()
        var weight: Double = llistaAtributs[42].toDouble()

        var pokemon: Pokemon = Pokemon(
            number,
            name,
            type1,
            type2,
            abilities,
            hp,
            attack,
            defense,
            spAtk,
            spDef,
            speed,
            experienceType,
            finalEvolution,
            catchRate,
            legendary,
            height,
            weight
        )
        llistaPokemons.add(pokemon)
        var imagePath = pokemon.generateImagePath()
        pokemon.setImagePath(imagePath)
    }
    return llistaPokemons
}

fun main() {

    var llistaPokemons = crearPokemons()
    for (pokemon in llistaPokemons) {
        println(pokemon)
    }
}

/**
 * Funció per obtenir el tipus de Pokémon a partir d'una cadena de text.
 * La funció converteix el tipus de Pokémon a un valor de la classe [PokemonType].
 *
 * @param type El tipus del Pokémon en format cadena (ex. "fire", "water", etc.)
 * @return El tipus corresponent de la classe [PokemonType].
 * @since 03/03/03
 */
fun pokemonType(type: String): PokemonType {
    var pokemonType: PokemonType
    when (type.lowercase()) {
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

/**
 * Funció per importar els Pokémons des d'un fitxer serialitzat.
 * Si el fitxer existeix, carrega i retorna una llista de Pokémons.
 * Si no existeix, retorna una llista buida.
 *
 * @return Una llista mutable de Pokémons importats des del fitxer.
 * @since 03/03/03
 */
fun importarPokemons(): MutableList<Pokemon> {
    if (file.exists()) {
        ObjectInputStream(FileInputStream(file)).use { ois ->
            return ois.readObject() as MutableList<Pokemon>
        }
    } else return mutableListOf()
}
