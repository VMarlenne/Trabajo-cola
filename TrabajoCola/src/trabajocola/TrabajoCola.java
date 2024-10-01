package trabajocola;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class TrabajoCola<T> {
    private LinkedList<T> queue;

    public TrabajoCola() {
        this.queue = new LinkedList<>();
    }

    public void enqueue(T item) {
        queue.addLast(item);
        System.out.println("Elemento añadido: " + item);
    }

    public T dequeue() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("La cola está vacia.");
        }
        T removedItem = queue.removeFirst();
        System.out.println("Elemento eliminado: " + removedItem);
        return removedItem;
    }

    public T peek() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("La cola está vacia.");
        }
        return queue.getFirst();
    }

    public int count() {
        return queue.size();
    }

    public void clear() {
        queue.clear();
        System.out.println("La cola ha sido vaciada.");
    }

    public T getFirst() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("La cola está vacia.");
        }
        return queue.getFirst();
    }

    public T getLast() {
        if (queue.isEmpty()) {
            throw new NoSuchElementException("La cola esta vacia.");
        }
        return queue.getLast();
    }

    public LinkedList<T> getAll() {
        return new LinkedList<>(queue);
    }

    public static void main(String[] args) {
        TrabajoCola<Object> queue = new TrabajoCola<>();

        queue.enqueue("Elemento 1");    
        queue.enqueue(42);              
        queue.enqueue(3.1416);          

        System.out.println("Primer elemento (peek): " + queue.peek());

        System.out.println("Numero de elementos en la cola: " + queue.count());

        queue.dequeue();

        System.out.println("Primer elemento: " + queue.getFirst());
        System.out.println("Último elemento: " + queue.getLast());

        System.out.println("Todos los elementos en la cola: " + queue.getAll());

        queue.clear();

        System.out.println("Numero de elementos despues de vaciar: " + queue.count());
    }
}

