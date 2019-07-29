package smartCast

/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 2 - Chapitre 3 : Decouvrez le Smart Cast
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction, guessTheType, permettant de deviner et d'afficher
 * dans la console le type d'un objet passe en parametre.
 * Les types supportes seront Int, String, List, Boolean et Array
 *
 * - Afficher le resultat de cette fonction dans la console.
 *
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {

    //test Int
    guessTheType(20)

    //test String
    guessTheType("test")

    //test List
    guessTheType(listOf("John Doe", "Tigre Bois"))

    //test null
    guessTheType(3.45)
}


private fun guessTheType(obj: Any) = when(obj) {
    is Int -> println("Int")
    is String -> println("String")
    is List<*> -> println("List")
    is Boolean -> println("Boolean")
    is Array<*> -> println("Array")
    else -> println("Error ! Type not recognized...")
}