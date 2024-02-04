package SpecialStack;

public interface SpecialStack<T> {
    void push(T element);
    T pop();
    T top();
    int size();
    boolean isEmpty();
    T getMax();
}
