//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    println("=== DEMO VERERBUNG: ================")

    // 1: Ableiten aus Basisklasse
    val bello = Hund_aus_Basisklasse()
    bello.taufeAufDenNamen("Bello")

    // 2: Ableiten aus abstrakter Klasse
    val lilly = Katze_aus_abstrakter_Klasse()
    lilly.taufeAufDenNamen("Lilly")

    // 3: Ableiten aus Interface
    val elsa = Kuh_aus_Interface("Elsa")

    println("Hund ${bello.name} sagt: ${bello.gibLaut()}")
    println("Katze ${lilly.name} sagt: ${lilly.gibLaut()}")
    println("Kuh ${elsa.name} sagt: ${elsa.gibLaut()}")

    println("=== DEMO POLYMORPHIE: ==============")
    // Hund und Vogel sind von derselben Basisklasse abgeleitet und ueberschreiben die Methode gibLaut()
    // auf unterschiedliche Weise. Obwohl der Datentyp der Liste "Tier_Basisklasse" ist, wird nicht die Methode
    // der Basisklasse aufgerufen, sondern die von Hund bzw. Vogel. Das ist Polymorphie!

    val tier1: Tier_Basisklasse = Hund_aus_Basisklasse()
    val tier2: Tier_Basisklasse = Vogel_aus_Basisklasse()
    val tiere = listOf(tier1, tier2)

    for (tier in tiere) {
        println("Dieses Tier sagt: ${tier.gibLaut()}")

//        if( tier is Katze_aus_abstrakter_Klasse){
//            println("Ist eine Katze")
//            val k:Katze_aus_abstrakter_Klasse = tier
//            println(k.schnurre())
//        }else{
//            println("Ist ein Hund")
//        }
    }


    //println("Bello gibt Laut  ${bello.gibLaut()}")
}

