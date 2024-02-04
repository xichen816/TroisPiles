package SpecialStack;

/**
 * Classe représentant une pile spéciale
 *
 * @param <T> le type d'élément dans la pile
 */
public class SpecialArrayStack<T extends Comparable<T>> implements SpecialStack<T>{
    private static final int maxSize = 100;
    private final T[] array;
    private final T[] maxArray; // Array to track the maximum element at each position
    private int top;

    @SuppressWarnings("unchecked")
    public SpecialArrayStack() {
        array = (T[]) new Comparable[maxSize];
        maxArray = (T[]) new Comparable[maxSize];
        top = -1;
    }

    @Override
    public void push(T t) {
        if (top == maxSize - 1) {
            throw new IllegalStateException("Pile pleine: L'élément ne peut être empilé.");
        } else {
            top++;
            array[top] = t;

            // Mettre à jour maxArray pour trouver l'élément maximum à la position actuelle
            if (top == 0 || t.compareTo(maxArray[top - 1]) > 0) {
                maxArray[top] = t;
            } else {
                maxArray[top] = maxArray[top - 1];
            }
        }
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Pile vide: L'élément ne peut être retiré.");
            return null;
        } else {
            T t = array[top];
            array[top--] = null;

            if (top >= 0) {
                maxArray[top] = (top == 0) ? array[top] : maxArray[top - 1];
            }
            return t;
        }
    }

    @Override
    public T top() {
        if (isEmpty()) {
            System.out.println("Pile vide: Le dernier élément ne peut être renvoyé.");
            return null;
        } else {
            return array[top];
        }
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public T getMax() {
        if (isEmpty()) {
            System.out.println("Pile vide: L'élément maximum ne peut être renvoyé");
            return null;
        } else {
            return maxArray[top];
        }
    }


}
