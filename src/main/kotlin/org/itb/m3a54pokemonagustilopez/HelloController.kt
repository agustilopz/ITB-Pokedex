package org.itb.m3a54pokemonagustilopez

import controller.crearPokemons
import javafx.fxml.FXML
import javafx.scene.control.*
import javafx.scene.image.Image
import javafx.scene.image.ImageView

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
    private lateinit var lblExperienceType: Label

    @FXML
    private lateinit var lblFinalEvolution: Label

    @FXML
    private lateinit var lblCatchRate: Label

    @FXML
    private lateinit var lblLegendary: Label

    @FXML
    private lateinit var lblHeight: Label

    @FXML
    private lateinit var lblWeight: Label

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
    private lateinit var btnPrevious: Button

    @FXML
    private lateinit var pokemonImage: ImageView


    // Començarem pel pokemon en la posició [0]
    private var indexActual = 0
    var llistaPokemons = crearPokemons()


    @FXML
    fun initialize() {
        mostrarPokemons()
    }


    private fun mostrarPokemons() {
        val pokemon = llistaPokemons[indexActual]
        lblCount.text = "${indexActual+1}/${llistaPokemons.size}"
        lblName.text = pokemon.getName().uppercase()
        lblType1.text = pokemon.getType1().eng.uppercase()
        lblType2.text = "Type 2"// + pokemon.getType2()
        lblHp.text = "HP"// + pokemon.getHp()
        lblAttack.text = "Attack"// + pokemon.getAttack()
        lblDefense.text = "Defense"// + pokemon.getDefense()
        lblspAtk.text = "Sp. Atk"// + pokemon.getSpatk()
        lblspDef.text = "Sp. Def"// + pokemon.getSpdef()
        lblspeed.text = "Speed"// + pokemon.getSpeed()
        lblEncounters1.text = "Encounters"
        lblEncounters2.text ="Number Defeated: 0"
        lblEncounters3.text ="Number Defeated: 0"
        progressBarAttack.progress = pokemon.getHp() / 130.0
        progressBarDefense.progress = pokemon.getDefense() / 130.0
        progressBarSpAtk.progress = pokemon.getSpatk() / 130.0
        progressBarSpDef.progress = pokemon.getSpdef() / 130.0

        val imagePath = pokemon.getImagePath()
        val image = Image(javaClass.getResource(imagePath)!!.toExternalForm())
        pokemonImage.image = image

    }
    @FXML
    fun previousPokemon() {
        if (indexActual > 0) {
            indexActual--
            mostrarPokemons()
        }
    }

    @FXML
    fun nextPokemon() {
        if (indexActual < llistaPokemons.size - 1) {
            indexActual++
            mostrarPokemons()
        }
    }

}