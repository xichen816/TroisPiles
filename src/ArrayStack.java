/**
 * Une classe représentant un stack
 *
 * @param <E> le type d'élément dans le stack
 */
public class ArrayStack<E> implements Stack<E> {

    private static final int maxSize = 100;
    private final E[] array;
    private int top;

    public ArrayStack() {
        array = (E[]) new Object[maxSize];
        top = -1;
    }

    /**{@inheritDoc}*/
    @Override
    public void push(E e){
        if (top == maxSize -1) {
            throw new IllegalStateException("Stack overflow. Cannot push element");
        } else {
            top++;
            array[top] = e;
            System.out.println("Pushed element: " + e);
        }
    }

    /**{@inheritDoc}*/
    @Override
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

    /**{@inheritDoc}*/
    @Override
    public E top(){
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot get top element.");
            return null;
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
