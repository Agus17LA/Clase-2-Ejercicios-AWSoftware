package clase_3;

import java.sql.Array;

public class FilaRaw<T> {
    private T[] fila ;
    private int front;
    private int rear;
    private int maxSize;
    private int size;

    @SuppressWarnings("unchecked")
    public FilaRaw(int maxSize) {
        this.maxSize = maxSize;
        this.fila = (T[]) new Object[maxSize];
        this.front = 0;
        this.size = 0;
        this.rear = -1;
    }

    public void addItem(T item){
        if (isFull()) {
            throw new IllegalStateException("La fila está llena");
        }
        rear = (rear + 1) % fila.length; //evitamos overflow
        fila[rear] = item;
        size++;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("La fila está vacía");
        }
        T item = fila[front];
        front = (front + 1) % fila.length;
        size--;
        return item;
    }

    public T getFront() {
        if (isEmpty()) {
            throw new IllegalStateException("La fila está vacía");
        }
        return fila[front];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size == maxSize;
    }

    public int size(){
        return size;
    }



}
