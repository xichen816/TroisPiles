public class ArrayStack<E> implements Stack{

    private static final int maxSize = 100;
    private final E[] array;
    private int top;

    public ArrayStack() {
        array = (E[]) new Object[maxSize];
        top = -1;
    }

    /**
     * Empile un élément
     *
     * @param e l'élément à empiler
     */
    public void push(E e){
        if (top == maxSize -1) {
            throw new IllegalStateException("Stack overflow. Cannot push element");
        } else {
            top++;
            array[top] = e;
            System.out.println("Pushed element: " + e);
        }
    }

    /**
     * Retire le dernier élément de la pile et le renvoie.
     *
     * @return le dernier élément de la pile
     */
    public E pop(){
        if (isEmpty()){
            System.out.println("Stack underflow. Cannot pop element.");
            return null;
        } else {
            E element = array[top];
            array[top--] = null; //libère la référence au dernier élément
            return element;
        }

    }

    /**
     * Obtient l'élément situé au sommet de la pile
     *
     * @return l'élément au sommet de la pile
     */
    public E top(){
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot get top element.");
            return null;
        } else {
            return array[top];
        }
    }

    /**
     * Obtient la taille actuelle de la pile
     *
     * @return la taille de la pile
     */
    public int size(){
        return top + 1;
    }

    /**
     * Vérifie si la pile est vide
     *
     * @return true si la pile est vide, sinon false
     */
    public boolean isEmpty(){
        return (top == -1);
    }

    /**
     * Convertit le contenu de la pile sous forme de String
     *
     * @return une représentation de la pile en String
     */
    public String toString(){
        // Commencer à construire la chaîne
        StringBuilder result = new StringBuilder("[");

        for (int i = 0; i <= top; i++) {
            // Ajout de chaque élément à la chaîne résultante.
            result.append(array[i]);

            // Séparer les éléments par une virgule.
            if (i < top) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}
