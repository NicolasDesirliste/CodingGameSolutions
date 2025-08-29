// Lien: https://www.codingame.com/ide/puzzle/the-descent

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/


// game loop

while (true) // while (true) - Boucle infinie pour les tours de jeu successifs. 
    {
    let mountains = []; // Déclare un tableau vide. let permet de modifier la variable, [] crée un tableau JavaScript.
    for (let i = 0; i < 8; i++) // Boucle qui s'exécute 8 fois, i va de 0 à 7.
        {
        const mountainH = parseInt(readline()); // represents the height of one mountain.
        // readline() lit une ligne depuis l'entrée, parseInt() convertit le texte en nombre entier, const déclare une variable non-modifiable.
        mountains[i] = mountainH; // Stockage dans le tableau 
        // mountains[i] = mountainH; - Place la hauteur lue dans le tableau à l'index i.
    }
    // Trouver le maximum 

    // Faire avec une méthode intégrée (façon php): 
    let maxHeight = Math.max(...mountains); // Trouver l'index de la hauteur maximale
    // let maxHeight = Math.max(...mountains); - Math.max() retourne la valeur maximale parmi ses arguments. 
    // Le ... (spread operator) décompose le tableau [5,9,3] en arguments séparés 5,9,3.

    let maxIndex = mountains.indexOf(maxHeight); // indexOf() cherche la valeur maxHeight dans le tableau et retourne sa position.


    console.log(maxIndex);     // The index of the mountain to fire on.
    // console.log(maxIndex); - Affiche l'index trouvé dans la console. 


} 

