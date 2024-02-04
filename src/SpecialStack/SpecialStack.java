package SpecialStack;

/**
 * TODO: javadoc
 * @param <T>
 */
public interface SpecialStack<T> {

    /**
     *
     * @param t
     */
    void push(T t);

    /**
     *
     * @return
     */
    T pop();

    /**
     *
     * @return
     */
    T top();

    /**
     *
     * @return
     */
    int size();

    /**
     *
     * @return
     */
    boolean isEmpty();

    /**
     *
     * @return
     */
    T getMax();
}
