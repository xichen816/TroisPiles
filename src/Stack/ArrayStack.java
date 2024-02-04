package Stack;

/**
 * Classe générique représentant une pile simple
 *
 * @param <E> le type d'élément dans la pile
 */
public class ArrayStack<E> implements Stack<E> {

    private static final int maxSize = 100;
    private final E[] array;
    private int top;

    @SuppressWarnings("unchecked")
    public ArrayStack() {
        array = (E[]) new Object[maxSize];
        top = -1;
    }

    /**{@inheritDoc}*/
    @Override
    public void push(E e){
        if (top == maxSize -1) {
            throw new IllegalStateException("Pile pleine: L'élément ne peut être empilé");
        } else {
            top++;
            array[top] = e;
        }
    }

    /**{@inheritDoc}*/
    @Override
    public E pop(){
        if (isEmpty()){
            throw new IllegalStateException("Pile vide: L'élément ne peut être retiré.");
        } else {
            E element = array[top];
            array[top--] = null; //libère la référence au dernier élément
            return element;
        }

    }

    /**{@inheritDoc}*/
    @Override
    public E top(){
        if (isEmpty()) {
            throw new IllegalStateException("Pile vide: Le dernier élément ne peut être renvoyé.");
        } else {
            return array[top];
        }
    }

    /**{@inheritDoc}*/
    @Override
    public int size(){
        return top + 1;
    }

    /**{@inheritDoc}*/
    @Override
    public boolean isEmpty(){
        return (top == -1);
    }

    /**{@inheritDoc}*/
    @Override
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
