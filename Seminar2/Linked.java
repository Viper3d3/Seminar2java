package Seminar2;

import java.util.LinkedList;
// Реализуйте очередь с помощью LinkedList со следующими методами:
//• enqueue() — помещает элемент в конец очереди,
//• dequeue() — возвращает первый элемент из очереди и удаляет его,
//• first() — возвращает первый элемент из очереди, не удаляя.
public class Linked{
    private LinkedList<Linked> list = new LinkedList<>();

    public void enqueue(Linked item) {
        list.addLast(item);
    }

    public Linked dequeue() {
        return list.pollFirst();
    }

    public Linked first() {
        return list.getFirst();
    }
}
