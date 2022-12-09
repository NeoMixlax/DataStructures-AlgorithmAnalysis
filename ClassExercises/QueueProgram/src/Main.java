public class Main {

    public static void main(String[] args) {
        Cola miCola = new Cola();
        miCola.enqueue(12);
        miCola.enqueue(15);

        miCola.peek();
        miCola.dequeue();
        miCola.peek();
        miCola.dequeue();
        miCola.peek();
    }
}
