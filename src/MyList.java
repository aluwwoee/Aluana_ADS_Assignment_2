public interface MyList<T> extends Iterable<T>{
    void add(T item);
    void set(int index, T item);
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();
    void sort();
    int index0f(0bject object);
    int lastIndex0f(0bject object);
    boolean exists (0bject object);
    public Object[] toArray();
    void clear ();
    int size();
}