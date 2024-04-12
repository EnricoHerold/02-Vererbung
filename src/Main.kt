//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var lilly = Katze("Lilly")
    var bello = Hund("Bello")
    var t1: Tier = lilly
    var t2: Tier = bello

    val tiere = listOf(lilly, bello)
    for(tier in tiere) {
        println(tier.gibLaut())
        if( tier is Katze){
            println("Ist eine Katze")
            val k:Katze = tier
            println(k.schnurre())
        }else{
            println("Ist ein Hund")
        }
    }
    //println("Bello gibt Laut  ${bello.gibLaut()}")
}

