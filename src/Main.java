public class Main {
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Stack pop: " + stack.pop());

        MyQueue<String> queue = new MyQueue<>();
        queue.enqueue("A");
        queue.enqueue("B");
        System.out.println("Queue dequeue: " + queue.dequeue());

        MyMinHeap<Integer> heap = new MyMinHeap<>();
        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        System.out.println("Heap min: " + heap.getMin());
        System.out.println("Heap extractMin: " + heap.extractMin());

        MyList<String> arrayList = new MyArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        System.out.println("ArrayList get(1): " + arrayList.get(1));

        MyList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(100);
        linkedList.add(200);
        System.out.println("LinkedList get(0): " + linkedList.get(0));
    }
}