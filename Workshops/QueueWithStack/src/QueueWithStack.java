import java.util.Stack;

public class QueueWithStack {
    public Stack<Integer> myStack = new Stack<>();

    public void enQueue(int n){
        myStack.push(n);
    }

    public int deQueueLong(Stack<Integer> pilaApoyo){
        int value, result = 0;
        if(pilaApoyo.isEmpty()){
            System.out.println("No hay nada que deslistar");
            return -1;
        } else if(pilaApoyo.size() == 1){
            return pilaApoyo.pop(); // Caso base, cuando solo queda un elemento este será el primero de nuestra fila
        } else {
            value = pilaApoyo.pop();
            result = deQueueLong(pilaApoyo);
            pilaApoyo.push(value); // Se regresan todos los valores que se quitaron para acceder al fondo de la pila
            return result;
        }
    }

    public int deQueue(){
        return deQueueLong(myStack);
    }

    public boolean isEmpty(){
        return myStack.isEmpty();
    }

    public int peekLong(Stack<Integer> pilaApoyo) { // Muy similar a los deQueue pero sin eliminar el elemento que se requiere
        int value, result = 0;
        if (pilaApoyo.isEmpty()) {
            System.out.println("No hay nada que deslistar");
            return -1;
        } else if (pilaApoyo.size() == 1) {
            return pilaApoyo.peek();
        } else {
            value = pilaApoyo.pop();
            result = peekLong(pilaApoyo);
            pilaApoyo.push(value);
            return result;
        }
    }

    public int peek(){
        return peekLong(myStack);
    }
}
