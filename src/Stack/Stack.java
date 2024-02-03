package Stack;

/**
 * Une interface représentant un stack.
 *
 * @param <E> le type d'élément dans le stack
 */
public interface Stack<E> {
    /**
     * Empile un élément.
     *
     * @param e l'élément à empiler
     */
    void push(E e);

    /**
     * Retire le dernier élément de la pile et le renvoie.
     *
     * @return le dernier élément de la pile
     */
    E pop();

    /**
     * Renvoie le dernier élément sur la pile.
     *
     * @return l'élément au sommet de la pile
     */
    E top();

    /**
     * Renvoie la longueur de la pile.
     *
     * @return la longueur de la pile
     */
    int size();

    /**
     * Vérifie si la pile est vide.
     *
     * @return true si la pile est vide, sinon false
     */
    boolean isEmpty();

    /**
     * Produit une représentation en chaîne (String) des éléments de la pile classés de haut en bas.
     *
     * @return une représentation de la pile en String
     */
    String toString();
}
