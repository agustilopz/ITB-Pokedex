package models

class Pokemon {
    private var number: Int
    private var name: String
    private var type1: PokemonType
    private var type2: PokemonType
    private var attack: Int
    private var defense: Int
    private var experienceType: String
    private var finalEvolution: Boolean
    private var catchRate: Int
    private var legendary: Boolean
    private var height: Double
    private var weight: Double

    constructor(number: Int, name: String, type1: PokemonType, type2: PokemonType, attack: Int, defense: Int, experienceType: String, finalEvolution: Boolean, catchRate: Int, legendary: Boolean, height: Double, weight: Double) {
        this.number = number
        this.name = name
        this.type1 = type1
        this.type2 = type2
        this.attack = attack
        this.defense = defense
        this.experienceType = experienceType
        this.finalEvolution = finalEvolution
        this.catchRate = catchRate
        this.legendary = legendary
        this.height = height
        this.weight = weight

    }

    override fun toString(): String {
        return "Name: $name, Type 1: ${type1.eng}, Type 2: ${type2.eng}, " +
                "Attack: $attack, Defense: $defense, Experience Type: $experienceType, " +
                "Final Evolution: $finalEvolution, Catch Rate: $catchRate, " +
                "Legendary: $legendary, Height: $height, Weight: $weight"
    }


}