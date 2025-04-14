public class MyArrayList<T> implements MyList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public void add(T item) {
        if (size == elements.length) resize();
        elements[size++] = item;
    }

    public void add(int index, T item) {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        if (size == elements.length) resize();
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        size++;
    }

    private void resize() {
        Object[] newElements = new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) newElements[i] = elements[i];
        elements = newElements;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        return (T) elements[index];
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        T removed = (T) elements[index];
        for (int i = index; i < size - 1; i++) elements[i] = elements[i + 1];
        elements[--size] = null;
        return removed;
    }

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public void clear() {
        elements = new Object[10];
        size = 0;
    }

    @Override
    public boolean contains(T item) {
        for (int i = 0; i < size; i++) if (elements[i].equals(item)) return true;
        return false;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            private int index = 0;
            public boolean hasNext() { return index < size; }
            public T next() { return (T) elements[index++]; }
        };
    }
}