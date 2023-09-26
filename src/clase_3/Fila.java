package clase_3;

import java.util.ArrayList;
import java.util.List;

public class Fila<T> {
    private final List<T> fila;

    public Fila(){
        this.fila = new ArrayList<>();
    }

    public void addItem(T item){
        this.fila.add(item);
    }

    public T removeItem() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("La fila está vacía");
        }
        return fila.remove(0);
    }

    public T front() {
        if (fila.isEmpty()) {
            throw new IllegalStateException("La fila está vacía");
        }
        return fila.get(0);
    }

    public boolean isEmpty() {
        return fila.isEmpty();
    }

    public int size() {
        return fila.size();
    }



    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();
        fila.addItem("Primer item");
        fila.addItem("Segundo item");
        System.out.println(fila.front());
        fila.removeItem();
        System.out.println(fila.front());
    }
}

