<?php
// Lien: https://www.codingame.com/ide/puzzle/the-descent

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/


// game loop
while (TRUE) // Boucle infinie 
    {
    $mountains = []; // Création d'un tableau vide
    // [] = la synthaxe modèrne equivalente à array() en php. 
    
    for ($i = 0; $i < 8; $i++) // boucle for standard  
        {
        fscanf(STDIN, "%d", $mountainH);
        // Lit un entier depuis l'entrée standard. STDIN = entrée, "%d" = format entier, $mountainH = variable de réception.
        $mountains[$i] = $mountainH; // Stocke la valeur lue dans le tableau à l'index $i.
    }
    
    // Après cette boucle : $mountains = [hauteur0, hauteur1, hauteur2, ..., hauteur7]

    // Trouver l'index de la montagne la plus haute (Version PHP simple) 

    $maxHeight = max($mountains); /* Fonction intégrée PHP qui retourne la valeur maximale du tableau. 
    Je la trouve beaucoup plus simple que la boucle Java.*/

    $targetIndex = array_search($maxHeight, $mountains);
    /* Fonction qui cherche une valeur dans un tableau et retourne son index. 
    Trouve où se situe la hauteur maximale. */
    
    echo($targetIndex."\n"); // Affiche l'index trouvé suivi d'un saut de ligne.
}
?>