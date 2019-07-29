package lambda

/**
 *  ----- INITIEZ-VOUS A KOTLIN -----
 *
 * Partie 3 - Chapitre 4 : Tirez parti des lambdas
 *
 *  ----- ENONCE -----
 *
 * Dans cet exercice interactif, vous allez devoir :
 *
 * - Creer une fonction d'extension, maxUser, s'appliquant uniquement derriere
 * une liste d'objet de type d'User.
 * 		* La fonction d'extension devra etre placee dans le fichier "UserExtensions"
 * 		* Celle-ci devra contenir une lambda en parametre d'entree
 * 		* Retourner l'utilisateur de la liste qui possede la valeur la plus haute
 * de la propriete passee dans la lambda (soit "age", soit "experience")
 *
 * - Les blocs de code actuellement commentes devront fonctionner et renvoyer
 *  le resultat indique.
 *
 *
 * A vous de jouer, et bon courage !
 *
 */

data class User(var email: String, var age: Int, var experience: Int)