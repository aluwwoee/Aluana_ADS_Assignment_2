public interface MyList<T> extends Iterable<T> {
    void add(T item);
    T get(int index);
    T remove(int index);
    int size();
    boolean isEmpty();
    void clear();
    boolean contains(T item);
}