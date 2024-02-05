package SpecialStack;

/**
 * Une interface qui représente une pile
 *
 * @param <T> le type d'élément dans le stack
 */
public interface SpecialStack<T> {

    /**
     * Permet d'empiler un élément
     *
     * @param t l'élément qui est empilé
     */
    void push(T t);

    /**
     * Permet de retourner et de retirer le dernier élément empilé
     *
     * @return dernier élément de la pile
     */
    T pop();

    /**
     * Permet de voir l'élément au sommet de la pile
     *
     * @return l'élément au sommet de la pile
     */
    T top();

    /**
     * Permet d'obtenir la taille de la pile
     *
     * @return la taille de la pile
     */
    int size();

    /**
     * Vérifie si la pile est vide
     *
     * @return un boolean précisant si la pile est vide ou nan
     */
    boolean isEmpty();

    /**
     * Renvoie l'élément qui possède la plus grande valeur 
     *
     * @return l'élément qui possède la valeur maximale de la pile
     */
    T getMax();
}
