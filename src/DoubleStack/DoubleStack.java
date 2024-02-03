package DoubleStack;

public interface DoubleStack<E> {

    /**
     * Ajoute un élément sur la pile et renvoie vrai. Renvoie faux si ce n'est pas possible.
     *
     * @param one Indique si l'on traite les éléments à la 1re ou 2e pile. True pour la pile 1 et False pour la pile 2
     * @param e l'élément à empiler
     * @return True si l'élément est empilé, False sinon
     */
    boolean push(boolean one, E e);

    /**
     * Retire le dernier élément sur la pile et le renvoie.
     *
     * @param one True pour la pile 1, False pour la pile 2
     * @return le dernier élément sur la pile
     */
    E pop(boolean one);

    /**
     * Renvoie le dernier élément sur la pile.
     *
     * @param one True pour la pile 1, False pour la pile 2
     * @return le dernier élément sur la pile
     */
    E top(boolean one);

    /**
     * Renvoie la longueur de la pile.
     * @param one True pour la pile 1, False pour la pile 2
     * @return longueur de la pile spécifiée
     */
    int size(boolean one);

    /**
     * Vérifie si la pile double est pleine.
     * @return True si pleine, False sinon
     */
    boolean isFull();

    /**
     * Imprime le contenu des 2 piles
     */
    void print();
}
