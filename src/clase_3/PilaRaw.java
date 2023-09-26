package clase_3;

public class PilaRaw<T> {
    private T[] elements;
    private int top; // Index of the top element
    private int maxSize;

    public PilaRaw(int maxSize) {
        this.maxSize = maxSize;
        //noinspection unchecked
        elements = (T[]) new Object[maxSize];
        top = -1;
    }

    public void push(T element) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        top++;
        elements[top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        T element = elements[top];
        top--;
        return element;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void main(String[] args) {
        PilaRaw<String> stack = new PilaRaw<>(5);

        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");
        stack.push("item 4");
        stack.push("item 5");

        System.out.println(stack.peek());

        stack.pop();

        System.out.println(stack.peek());
    }

}
