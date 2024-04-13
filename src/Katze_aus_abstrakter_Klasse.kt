class Katze_aus_abstrakter_Klasse : Tier_AbstrakteKlasse() {

    fun taufeAufDenNamen(taufname: String) {
        this.name = taufname
    }

    override fun gibLaut(): String {
        return "miau"
    }

}