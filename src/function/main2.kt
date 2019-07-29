package function

/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 1 - Chapitre 3 : Implementez differentes fonctions
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir creer :
 *
 * - function.getResult() : Une fonction retournant le resultat (nombres entiers) d'une addition
 * entre les deux nombres fournis en parametre
 * - function.getUsernameUpperCase() : Une fonction retournant le nom de l'utilisateur
 * fourni en parametre, mais tout en majuscule !
 * - function.isUsernameOfTeacher() : Une fonction retournant true si le nom de l'utilisateur
 * fourni en parametre est égale à "Phil" ou "Ambroise", et false dans les autres cas.
 *
 * Au lancement du programme, vous executerez et afficherez le resultat
 * de ces trois fonctions.
 *
 * A vous de jouer, et bon courage !
 *
 */

fun main(args: Array<String>) {
    println(getResult(10, 5))
    println(getUsernameUpperCase("Benjamin"))
    println(isUsernameOfTeacher("Benjamin"))
    println(isUsernameOfTeacher("Phil"))


}


private fun getResult(a: Int, b: Int) =  a + b

private fun getUsernameUpperCase(name: String) = name.toUpperCase()

private fun isUsernameOfTeacher(name: String) = name == "Phil" || name == "Ambroise"