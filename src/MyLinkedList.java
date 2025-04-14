public class MyLinkedList<T> implements MyList<T> {
    private class MyNode {
        T data;
        MyNode next, prev;
        MyNode(T data) { this.data = data; }
    }

    private MyNode head, tail;
    private int size;

    @Override
    public void add(T item) {
        MyNode node = new MyNode(item);
        if (head == null) head = tail = node;
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        return curr.data;
    }

    @Override
    public T remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        MyNode curr = head;
        for (int i = 0; i < index; i++) curr = curr.next;
        if (curr.prev != null) curr.prev.next = curr.next;
        else head = curr.next;
        if (curr.next != null) curr.next.prev = curr.prev;
        else tail = curr.prev;
        size--;
        return curr.data;
    }

    @Override
    public int size() { return size; }

    @Override
    public boolean isEmpty() { return size == 0; }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public boolean contains(T item) {
        for (MyNode curr = head; curr != null; curr = curr.next)
            if (curr.data.equals(item)) return true;
        return false;
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return new java.util.Iterator<T>() {
            MyNode curr = head;
            public boolean hasNext() { return curr != null; }
            public T next() {
                T data = curr.data;
                curr = curr.next;
                return data;
            }
        };
    }
}