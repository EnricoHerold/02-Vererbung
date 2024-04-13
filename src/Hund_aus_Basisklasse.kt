class Hund_aus_Basisklasse : Tier_Basisklasse() {

    fun taufeAufDenNamen(taufname: String) {
        this.name = taufname
    }

    override fun gibLaut(): String {
        return "wau wau"
    }

}