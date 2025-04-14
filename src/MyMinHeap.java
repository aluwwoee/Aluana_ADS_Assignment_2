// MyMinHeap.java
public class MyMinHeap<T extends Comparable<T>> {
    private final MyArrayList<T> list = new MyArrayList<>();

    public void insert(T item) {
        list.add(item);
        heapifyUp(list.size() - 1);
    }

    public T extractMin() {
        if (list.isEmpty()) return null;
        T min = list.get(0);
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.add(0, last);
            heapifyDown(0);
        }
        return min;
    }

    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (list.get(index).compareTo(list.get(parent)) < 0) {
                swap(index, parent);
                index = parent;
            } else break;
        }
    }

    private void heapifyDown(int index) {
        int size = list.size();
        while (index < size) {
            int left = 2 * index + 1, right = 2 * index + 2, smallest = index;
            if (left < size && list.get(left).compareTo(list.get(smallest)) < 0) smallest = left;
            if (right < size && list.get(right).compareTo(list.get(smallest)) < 0) smallest = right;
            if (smallest != index) {
                swap(index, smallest);
                index = smallest;
            } else break;
        }
    }

    private void swap(int i, int j) {
        if (i == j) return; // ничего не делаем
        T tmp = list.get(i);
        T replaced = list.remove(j);
        list.add(j, tmp);
        list.remove(i);
        list.add(i, replaced);
    }


    public boolean isEmpty() {
        return list.isEmpty();
    }
}
