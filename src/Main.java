public class Main {
    public static void main(String[] args) {
        // Working with MyArrayList
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        fillList(arrayList);
        System.out.println("Content of MyArrayList:");
        print(arrayList);

        System.out.println("___________________________________________________");

        // Working with MyLinkedList
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        fillList(linkedList);
        System.out.println("Content of MyLinkedList:");
        print(linkedList);

        System.out.println("___________________________________________________");

        // Working with MyStack
        MyStack<Integer> stack = new MyStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Working with the stack (MyStack):");
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }

    // Method for displaying the contents of a list
    public static void print(MyList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    // Method to fill a list with numbers from 1 to 6
    public static void fillList(MyList<Integer> list) {
        for (int i = 1; i <= 6; i++) {
            list.add(i);
        }
    }
}
