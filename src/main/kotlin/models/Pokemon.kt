package models

/**
 * La classe [Pokemon] representa un Pokémon amb les seves característiques,
 * com el número, el nom, els tipus, les habilitats, les estadístiques de combat,
 * entre altres atributs. Aquesta classe inclou mètodes per obtenir i modificar
 * les propietats d'un Pokémon, així com per generar la ruta de la seva imatge.
 *
 * @constructor Crea un nou Pokémon amb els atributs proporcionats.
 * @param number El número del Pokémon (ID).
 * @param name El nom del Pokémon.
 * @param type1 El primer tipus del Pokémon.
 * @param type2 El segon tipus del Pokémon.
 * @param abilities Les habilitats del Pokémon.
 * @param hp Els punts de salut del Pokémon.
 * @param attack Els punts d'atac del Pokémon.
 * @param defense Els punts de defensa del Pokémon.
 * @param spAtk Els punts d'atac especial del Pokémon.
 * @param spDef Els punts de defensa especial del Pokémon.
 * @param speed Els punts de velocitat del Pokémon.
 * @param experienceType El tipus d'experiència del Pokémon.
 * @param finalEvolution Indica si el Pokémon és la seva evolució final.
 * @param catchRate La taxa de captura del Pokémon.
 * @param legendary Indica si el Pokémon és llegendari.
 * @param height L'alçada del Pokémon en metres.
 * @param weight El pes del Pokémon en quilograms.
 */
class Pokemon {
    private var number: Int
    private var name: String
    private var type1: PokemonType
    private var type2: PokemonType
    private var abilities: MutableList<String>
    private var hp: Int
    private var attack: Int
    private var defense: Int
    private var spAtk: Int
    private var spDef: Int
    private var speed: Int
    private var experienceType: String
    private var finalEvolution: Boolean
    private var catchRate: Int
    private var legendary: Boolean
    private var height: Double
    private var weight: Double
    private var imagePath: String = ""

    constructor(number: Int, name: String, type1: PokemonType, type2: PokemonType,abilities: MutableList<String>, hp: Int, attack: Int, defense: Int, spAtk: Int, spDef: Int, speed: Int, experienceType: String, finalEvolution: Boolean, catchRate: Int, legendary: Boolean, height: Double, weight: Double) {
        this.number = number
        this.name = name
        this.type1 = type1
        this.type2 = type2
        this.abilities = abilities
        this.hp = hp
        this.attack = attack
        this.defense = defense
        this.spAtk = spAtk
        this.spDef = spDef
        this.speed = speed
        this.experienceType = experienceType
        this.finalEvolution = finalEvolution
        this.catchRate = catchRate
        this.legendary = legendary
        this.height = height
        this.weight = weight

    }
    /**
     * Retorna el número del Pokémon.
     * @return El número del Pokémon.
     */
    fun getNumber(): Int {
        return number
    }

    /**
     * Estableix el número del Pokémon.
     * @param number El número del Pokémon.
     */
    fun setNumber(number: Int) {
        this.number = number
    }

    /**
     * Retorna el nom del Pokémon.
     * @return El nom del Pokémon.
     */
    fun getName(): String {
        return name
    }

    /**
     * Estableix el nom del Pokémon.
     * @param name El nom del Pokémon.
     */
    fun setName(name: String) {
        this.name = name
    }

    /**
     * Retorna el primer tipus del Pokémon.
     * @return El primer tipus del Pokémon.
     */
    fun getType1(): PokemonType {
        return type1
    }

    /**
     * Estableix el primer tipus del Pokémon.
     * @param type1 El primer tipus del Pokémon.
     */
    fun setType1(type1: PokemonType) {
        this.type1 = type1
    }

    /**
     * Retorna el segon tipus del Pokémon.
     * @return El segon tipus del Pokémon.
     */
    fun getType2(): PokemonType {
        return type2
    }

    /**
     * Estableix el segon tipus del Pokémon.
     * @param type2 El segon tipus del Pokémon.
     */
    fun setType2(type2: PokemonType) {
        this.type2 = type2
    }

    /**
     * Retorna l'atac del Pokémon.
     * @return L'atac del Pokémon.
     */
    fun getAttack(): Int {
        return attack
    }

    /**
     * Estableix l'atac del Pokémon.
     * @param attack L'atac del Pokémon.
     */
    fun setAttack(attack: Int) {
        this.attack = attack
    }

    /**
     * Retorna la defensa del Pokémon.
     * @return La defensa del Pokémon.
     */
    fun getDefense(): Int {
        return defense
    }

    /**
     * Estableix la defensa del Pokémon.
     * @param defense La defensa del Pokémon.
     */
    fun setDefense(defense: Int) {
        this.defense = defense
    }

    /**
     * Retorna el tipus d'experiència del Pokémon.
     * @return El tipus d'experiència del Pokémon.
     */
    fun getExperienceType(): String {
        return experienceType
    }

    /**
     * Estableix el tipus d'experiència del Pokémon.
     * @param experienceType El tipus d'experiència del Pokémon.
     */
    fun setExperienceType(experienceType: String) {
        this.experienceType = experienceType
    }

    /**
     * Retorna si el Pokémon és la seva evolució final.
     * @return `true` si el Pokémon és la seva evolució final, `false` en cas contrari.
     */
    fun isFinalEvolution(): Boolean {
        return finalEvolution
    }

    /**
     * Estableix si el Pokémon és la seva evolució final.
     * @param finalEvolution `true` si el Pokémon és la seva evolució final, `false` en cas contrari.
     */
    fun setFinalEvolution(finalEvolution: Boolean) {
        this.finalEvolution = finalEvolution
    }

    /**
     * Retorna la taxa de captura del Pokémon.
     * @return La taxa de captura del Pokémon.
     */
    fun getCatchRate(): Int {
        return catchRate
    }

    /**
     * Estableix la taxa de captura del Pokémon.
     * @param catchRate La taxa de captura del Pokémon.
     */
    fun setCatchRate(catchRate: Int) {
        this.catchRate = catchRate
    }

    /**
     * Retorna si el Pokémon és llegendari.
     * @return `true` si el Pokémon és llegendari, `false` en cas contrari.
     */
    fun isLegendary(): Boolean {
        return legendary
    }

    /**
     * Estableix si el Pokémon és llegendari.
     * @param legendary `true` si el Pokémon és llegendari, `false` en cas contrari.
     */
    fun setLegendary(legendary: Boolean) {
        this.legendary = legendary
    }

    /**
     * Retorna l'alçada del Pokémon.
     * @return L'alçada del Pokémon en metres.
     */
    fun getHeight(): Double {
        return height
    }



    /**
     * Retorna el pes del Pokémon.
     * @return El pes del Pokémon en quilograms.
     */
    fun getWeight(): Double {
        return weight
    }


    /**
     * Obté les habilitats del Pokémon.
     *
     * @return Les habilitats del Pokémon com una cadena de text.
     */
    fun getAbilities(): MutableList<String> {
        return abilities
    }

    /**
     * Obté els punts de salut (HP) del Pokémon.
     *
     * @return Els punts de salut (HP) del Pokémon.
     */
    fun getHp(): Int {
        return hp
    }

    /**
     * Obté els punts d'atac especial (SpAtk) del Pokémon.
     *
     * @return Els punts d'atac especial (SpAtk) del Pokémon.
     */
    fun getSpatk(): Int {
        return spAtk
    }

    /**
     * Obté els punts de defensa especial (SpDef) del Pokémon.
     *
     * @return Els punts de defensa especial (SpDef) del Pokémon.
     */
    fun getSpdef(): Int {
        return spDef
    }

    /**
     * Obté la velocitat del Pokémon.
     *
     * @return La velocitat del Pokémon.
     */
    fun getSpeed(): Int {
        return speed
    }

    /**
     * Genera la ruta de la imatge
     *
     * @return Ruta de la imatge.
     */
    fun generateImagePath(): String {
        return "/img/" + this.getName().lowercase() + ".png"
    }

    /**
     * Obté la ruta de imatge del Pokémon.
     *
     * @return Ruta de la imatge.
     */
    fun getImagePath(): String {
        return imagePath
    }

    /**
     * Modifica la ruta de la imatge del Pokémon
     *
     *@param path Ruta de la imatge
     */
    fun setImagePath(path: String) {
        this.imagePath = path
    }

    override fun toString(): String {
        return "Name: $name, Type 1: ${type1.eng}, Type 2: ${type2.eng}, " +
                "Abilities: ${abilities.joinToString(", ")}, HP: $hp, Attack: $attack, " +
                "Defense: $defense, Sp. Atk: $spAtk, Sp. Def: $spDef, Speed: $speed, " +
                "Experience Type: $experienceType, Final Evolution: $finalEvolution, " +
                "Catch Rate: $catchRate, Legendary: $legendary, Height: $height, Weight: $weight, Image Path: $imagePath"
    }



}