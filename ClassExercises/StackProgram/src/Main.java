public class Main {
    public static void main(String[] args) {
        Pila miPila = new Pila();
        miPila.push(5);
        System.out.println(miPila.getTamano());
        miPila.peek();
        miPila.push(4);
        miPila.push(3);
        miPila.peek();
        miPila.eliminarPila();
    }
}
