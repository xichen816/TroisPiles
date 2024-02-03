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
     * Obtient l'élément situé au sommet de la pile.
     *
     * @return l'élément au sommet de la pile
     */
    E top();

    /**
     * Obtient la taille actuelle de la pile.
     *
     * @return la taille de la pile
     */
    int size();

    /**
     * Vérifie si la pile est vide.
     *
     * @return true si la pile est vide, sinon false
     */
    boolean isEmpty();

    /**
     * Convertit le contenu de la pile en une représentation sous forme de chaîne.
     *
     * @return une représentation de la pile en String
     */
    String toString();
}
