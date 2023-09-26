package clase_3;

import java.util.ArrayList;
import java.util.List;

public class Pila<T> {
    private List<T> items;

    public Pila() {
        items = new ArrayList<>();
    }

    public void apilar(T item) {
        items.add(item);
    }

    public T desapilar() {
        if (items.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return items.remove(items.size() - 1);
    }

    public T consultarCima() {
        if (items.isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        return items.get(items.size() - 1);
    }

    public boolean estaVacia() {
        return items.isEmpty();
    }

    public int tamaño() {
        return items.size();
    }

    public static void main(String[] args) {
        Pila<String> pila = new Pila<>();
        pila.apilar("Elemento 1");
        pila.apilar("Elemento 2");

        System.out.println(pila.consultarCima());

        pila.desapilar();

        System.out.println(pila.consultarCima());
    }

}