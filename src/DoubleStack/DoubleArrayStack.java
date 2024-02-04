package DoubleStack;

/**
 * Classe représentant deux piles
 *
 * @param <E> le type d'élément dans la pile
 */
public class DoubleArrayStack<E> implements DoubleStack<E>{
    private static final int maxSize = 100;
    private E[] array;
    private int top1, top2;

    @SuppressWarnings("unchecked")
    public DoubleArrayStack() {
        array = (E[]) new Object[maxSize];

        // Initialiser les points de départ des deux piles.
        top1 = -1;
        top2 = maxSize;
    }

    /**{@inheritDoc}*/
    @Override
    public boolean push(boolean one, E e) {
        if (isFull()) {
            return false;
        }

        if (one) {
            array[++top1] = e;
        } else {
            array[--top2] = e;
        }
        return true;
    }

    /**{@inheritDoc}*/
    @Override
    public E pop(boolean one) {
        if (one) {
            if (top1 == -1) {
                throw new IllegalStateException("Pile 1 est vide. L'élément ne peut être retiré.");
            }
            return array[top1--];
        } else {
            if (top2 == maxSize) {
                throw new IllegalStateException("Pile 2 est vide. L'élément ne peut être retiré.");
            }
            return array[top2++];
        }
    }

    /**{@inheritDoc}*/
    @Override
    public E top(boolean one) {
        if (one) {
            return (top1 == -1) ? null : array[top1];
        } else {
            return (top2 == maxSize) ? null : array[top2];
        }
    }

    /**{@inheritDoc}*/
    @Override
    public int size(boolean one) {
        return (one) ? top1 + 1 : maxSize - top2;
    }

    /**{@inheritDoc}*/
    @Override
    public boolean isFull() {
        return top1 + 1 == top2; // Vérifier s'il reste une espace entre les deux piles
    }

    /**{@inheritDoc}*/
    @Override
    public void print() {
        System.out.println("Stack 1:");
        for (int i = 0; i <= top1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("Stack 2:");
        for (int i = maxSize - 1; i >= top2; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
