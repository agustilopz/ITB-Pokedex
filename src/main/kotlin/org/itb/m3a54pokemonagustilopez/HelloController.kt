package org.itb.m3a54pokemonagustilopez

import controller.crearPokemons
import javafx.fxml.FXML
import javafx.scene.control.*
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import kotlin.reflect.typeOf

/**
 * Controlador de la interfície gràfica d'usuari per mostrar i navegar per la llista de Pokémons.
 *
 * Aquest controlador gestiona la interacció amb la interfície d'usuari per mostrar informació detallada
 * sobre cada Pokémon (nom, tipus, estadístiques, imatge, etc.) i permet navegar entre els Pokémons mitjançant
 * els botons de "anterior" i "següent".
 *
 * @author Agustí López
 * @since 03/03/03
 */
class HelloController {

    @FXML
    private lateinit var lblCount: Label

    @FXML
    private lateinit var lblName: Label

    @FXML
    private lateinit var lblType1: Label

    @FXML
    private lateinit var lblType2: Label

    @FXML
    private lateinit var lblAbilities: Label

    @FXML
    private lateinit var lblHp: Label

    @FXML
    private lateinit var lblAttack: Label

    @FXML
    private lateinit var lblDefense: Label

    @FXML
    private lateinit var lblspAtk: Label

    @FXML
    private lateinit var lblspDef: Label

    @FXML
    private lateinit var lblspeed: Label

    @FXML
    private lateinit var lblEncounters1: Label

    @FXML
    private lateinit var lblEncounters2: Label

    @FXML
    private lateinit var lblEncounters3: Label

    @FXML
    private lateinit var progressBarHp: ProgressBar

    @FXML
    private lateinit var progressBarAttack: ProgressBar

    @FXML
    private lateinit var progressBarDefense: ProgressBar

    @FXML
    private lateinit var progressBarSpAtk: ProgressBar

    @FXML
    private lateinit var progressBarSpDef: ProgressBar

    @FXML
    private lateinit var progressBarSpeed: ProgressBar

    @FXML
    private lateinit var pokemonImage: ImageView


    // Començarem pel pokemon en la posició [0]
    private var indexActual = 0
    var llistaPokemons = crearPokemons()

    /**
     * Inicialitza el controlador i mostra el primer Pokémon.
     */
    @FXML
    fun initialize() {
        mostrarPokemons()
    }

    /**
     * Mostra les dades del Pokémon actual a la interfície d'usuari.
     *
     * Actualitza els valors de les etiquetes, barres de progrés i la imatge del Pokémon
     * en funció de les estadístiques del Pokémon actual seleccionat.
     */
    private fun mostrarPokemons() {
        val pokemon = llistaPokemons[indexActual]
        lblCount.text = "${indexActual+1}/${llistaPokemons.size}"
        lblName.text = pokemon.getName().uppercase()
        lblType1.text = pokemon.getType1().eng.uppercase()
        lblHp.text = "HP"
        lblAttack.text = "Attack"
        lblDefense.text = "Defense"
        lblspAtk.text = "Sp. Atk"
        lblspDef.text = "Sp. Def"
        lblspeed.text = "Speed"
        lblEncounters1.text = "Encounters"
        lblEncounters2.text ="Number Defeated: 0"
        lblEncounters3.text ="Number Defeated: 0"
        progressBarHp.progress = pokemon.getHp() / 130.0
        progressBarAttack.progress = pokemon.getAttack() / 130.0
        progressBarDefense.progress = pokemon.getDefense() / 130.0
        progressBarSpAtk.progress = pokemon.getSpatk() / 130.0
        progressBarSpDef.progress = pokemon.getSpdef() / 130.0
        progressBarSpeed.progress = pokemon.getSpeed() / 130.0
        var typeColor = "orange"
        when(pokemon.getType1().eng.lowercase()) {
            "normal" -> typeColor="#6604fe"
            "fire" -> typeColor="orange"
            "grass" -> typeColor="#4caf50"
            "water" -> typeColor="#0000FF"
            "psychic" -> typeColor="#9B4D96"
            "dragon" -> typeColor="#FF0000"
            "electric" -> typeColor="#FFFF00"
        }
        lblType1.style += " -fx-background-color: ${typeColor};"
        val imagePath = pokemon.getImagePath()
        val image = Image(javaClass.getResource(imagePath)!!.toExternalForm())
        pokemonImage.image = image

    }

    /**
     * Mostra el Pokémon anterior de la llista, si existeix.
     *
     * Redueix l'índex actual i actualitza la vista.
     */
    @FXML
    fun previousPokemon() {
        if (indexActual > 0) {
            indexActual--
            mostrarPokemons()
        }
    }

    /**
     * Mostra el següent Pokémon de la llista, si existeix.
     *
     * Augmenta l'índex actual i actualitza la vista.
     */
    @FXML
    fun nextPokemon() {
        if (indexActual < llistaPokemons.size - 1) {
            indexActual++
            mostrarPokemons()
        }
    }

}