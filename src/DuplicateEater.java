import Stack.ArrayStack;

import java.util.Arrays;

/**
 * Classe qui retourne une liste en ayant enlevé les motes en double
 *
 * @param <E> le type d'élément dans la pile
 */
public class DuplicateEater<E> {

    /**
     * Méthode qui enlève les mots en double dans une liste
     */
    public void pairDestroyer() {
        String[] destroyer = new String[] {"hey", "hello", "hello", "hi", "hello"}; // Création de la liste à vérifier
        ArrayStack<String> withoutDuplicate = new ArrayStack<String>(); // Création d'une pile

         String verif = ""; // initialise un string "vérif" vide

        System.out.println("Entrée :" + Arrays.toString(destroyer));
        System.out.println("Sortie :" + destroyer.length);

        for (String mot : destroyer) { // Boucle vérifiant s'il y a des doubles dans la liste
            if (mot == verif) { // Enlève le string en double
                withoutDuplicate.pop();
                if (withoutDuplicate.size() != 0) {
                    verif = withoutDuplicate.top();
                }
            }
            else { // Ajoute les mots non double à une pile
                withoutDuplicate.push(mot);
                verif = withoutDuplicate.top();
            }
        }

        System.out.println("Entrée : " + Arrays.toString(destroyer));
        System.out.println("Sortie : " + withoutDuplicate.size());
    }
}
