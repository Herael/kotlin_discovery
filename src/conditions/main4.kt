package conditions

/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 1 : Gerez des choix et des conditions
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction utilisant la structure de controle "if" uniquement.
 * Celle-ci devra retourner le plus petit des deux nombres fournis en parametre.
 * De plus, le résultat devra etre multiplie par 10.
 *
 * - Creer une enumeration representant les trois couleurs primaires. Puis,
 * creer une fonction, retournant pour chaque couleur son nom au format String
 * en anglais (par exemple "RED")
 *
 * - Afficher le resultat de ces deux fonctions dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
    println(minOf(15, 12))
    println("Color to string : ${colorToString(Color.GREEN)}")


}


fun minOf(a: Int, b: Int) = if (a < b) a*10 else b*10


fun colorToString(color: Color) = when(color)  {

    Color.RED -> "RED"
    Color.BLUE -> "BLUE"
    Color.GREEN -> "GREEN"
}


enum class Color{

    RED,
    GREEN,
    BLUE
}