import java.util.*;
public class MyStructure<T> {

    private Map<T, Node<T>> map;
    private Node<T> head;
    private Node<T> tail;

    private static class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public MyStructure() {
        map = new HashMap<>();
        head = new Node<>(null); 
        tail = new Node<>(null); 
        head.next = tail;
        tail.prev = head;
    }

    public void add(T element) {
        if (!map.containsKey(element)) {
            Node<T> newNode = new Node<>(element);
            newNode.next = tail;
            newNode.prev = tail.prev;
            tail.prev.next = newNode;
            tail.prev = newNode;
            map.put(element, newNode);
        }
    }

    public boolean contains(T element) {
        return map.containsKey(element);
    }

    public void delete(T element) {
        if (map.containsKey(element)) {
            Node<T> nodeToRemove = map.get(element);
            nodeToRemove.prev.next = nodeToRemove.next;
            nodeToRemove.next.prev = nodeToRemove.prev;
            map.remove(element);
        }
    }

    public void printElements() {
        Node<T> current = head.next;
        while (current != tail) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

}
