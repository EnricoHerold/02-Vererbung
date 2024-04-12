class Katze(name: String): Tier {

    val art: String = "Katze"
    val name = name

    fun schnurre(): String{
        return "rrrrr"
    }

    override fun gibLaut(): String {
        return "miau"
    }

}