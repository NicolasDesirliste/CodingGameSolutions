// lien: https://www.codingame.com/ide/puzzle/the-descent
/*

Objectif
Écrivez le programme permettant de détruire les montagnes pour pouvoir attérir. Pour cela, tirez sur la montagne la plus haute.
 	Règles
Au début de chaque tour de jeu, vous recevez en entrée la hauteur de chaque montagne de gauche à droite.
Avant la fin du tour de jeu, vous devez indiquer la montagne la plus haute pour tirer dessus.

Tirer sur une montagne ne fera qu'en détruire une partie. Votre vaisseau descend à chaque passe.
 
 
Conditions de victoire
Vous gagnez si vous détruisez la montagne la plus haute à chaque tour
 
Conditions de défaite
Votre vaisseau percute une montagne
Vous fournissez une sortie invalide ou votre programme ne réponds pas à temps
 	Note
N'oubliez pas d'exécuter les tests depuis la fenêtre "Jeu de tests". Les tests fournis et les validateurs utilisés pour le calcul du score sont légèrement différents pour éviter les solutions codées en dur.
 	Entrées du jeu
Le programme doit lire depuis l'entrée standard la hauteur des montagnes puis fournir sur la sortie standard l'indice de la montagne à détruire.
Entrées pour un tour de jeu
8 lignes : un entier mountainH par ligne. Il représente la hauteur d'une montagne. Les hauteurs des montagnes sont données dans l'ordre de leur index (allant de 0 à 7).
Sortie pour un tour de jeu
Une unique ligne contenant le numéro de la montagne sur laquelle tirer.
Contraintes
0 ≤ mountainH ≤ 9
Temps de réponse pour un tour ≤ 100ms
 */


// Solution expliquée:

import java.util.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player { // Nom de la classe principale, une classe est obligatoire pour tout code en java
    public static void main(String args[]) // Point d'entrée obligatoire de tout programme en java, aussi une méthode d'exécution.
    {
        Scanner in = new Scanner(System.in); // Crée un objet Scanner pour lire les données depuis l'entrée standard (clavier/input du jeu).

        // game loop
        while (true) // Boucle infinie. Le jeu se déroule en tours successifs jusqu'à ce que le programme soit arrêté externellement.
        {   // Lecture des données:
            int[] mountains = new int[8]; // Déclaration d'un tableau de [8] entiers pour stocker les hauteurs
            // Chaque case contient initialement 0. 
            
            // Lire et stocker les 8 hauteurs
            for (int i = 0; i < 8; i++) // Boucle qui s'execute 8 fois (i commence à 0 et s'arrête à 7)
            {
                mountains[i] = in.nextInt(); // Lit un nombre depuis l'input et le place à la position i du tableau.
            } 
            // Après cette boucle, le tableau contient les 8 hauteurs : mountains[0] = hauteur montagne 0, mountains[1] = hauteur montagne 1, etc.

            // Algo de recherche 

            // Trouver la montagne la plus haute
            int maxHeight = mountains[0]; // Initialise la hauteur maximale avec la première montagne.
            int maxIndex = 0; // Initialise l'index du maximum à 0 (première position).

            for (int i = 1; i < 8; i++) { // Parcourt le tableau depuis l'index 1 (on a déjà traité l'index 0).
                if (mountains[i] > maxHeight) { // Compare la hauteur actuelle avec le maximum connu.
                    maxHeight = mountains[i];
                    maxIndex = i;
                    // Si une montagne plus haute est trouvée, met à jour le maximum et son index.
                }
            }

            // - Affiche l'index de la montagne la plus haute.
            System.out.println(maxIndex); 
            // De cette façon à chaque tour le jeu modifie les hauteurs selon le tir, puis le processus recommence pour trouver la nouvelle cible (jusqu'à 7).
        }
    }
}
