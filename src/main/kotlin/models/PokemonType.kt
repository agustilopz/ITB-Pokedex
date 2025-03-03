package models

/**
 * Aquesta classe enum defineix els diferents tipus de Pokémon.
 * Cada tipus té dues propietats: el nom en anglès (`eng`) i el nom en català (`cat`).
 *
 * Els tipus de Pokémon defineixen les característiques i habilitats d'un Pokémon en funció de la seva classe,
 * influenciant així la seva interacció amb altres tipus en combats.
 *
 * @property eng El nom del tipus en anglès.
 * @property cat El nom del tipus en català.
 * @since 03/03/03
 * @author agustí.lópez
 */
enum class PokemonType (val eng: String, val cat: String) {
  BUG("Bug", "Insecte"),
    DARK("Dark", "Fosc"),
    DRAGON("Dragon", "Drac"),
    ELECTRIC("Electric", "Elèctric "),
    FAIRY("Fairy","Fada"),
    FIGHTING("Fighting","Lluita"),
    FIRE("Fire", "Foc"),
    FLYING("Flying", "Volador"),
    GHOST("Ghost", "Fantasma"),
    GRASS("Grass", "Planta"),
    GROUND("Ground", "Terra"),
    ICE("Ice", "Gel"),
    NORMAL("Normal", "Normal"),
    POISON("Poison", "Verí"),
    PSYCHIC("Psychic", "Psíquic"),
    ROCK("Rock", "Rock"),
    STEEL("Steel", "Roca"),
    WATER("Water", "Acer"),
    N_A("N/A", "Aigua"),
}