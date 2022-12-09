public class Main {
    public static void main(String[] args) {
        BinaryTree miArbol = new BinaryTree();

        miArbol.instertarNodoRecursivo(10);
        miArbol.instertarNodoRecursivo(5);
        miArbol.instertarNodoRecursivo(8);
        miArbol.instertarNodoRecursivo(2);
        miArbol.instertarNodoRecursivo(3);
        miArbol.instertarNodoRecursivo(1);
        miArbol.instertarNodoRecursivo(9);
        miArbol.instertarNodoRecursivo(6);
        miArbol.instertarNodoRecursivo(15);
        miArbol.instertarNodoRecursivo(16);
        miArbol.instertarNodoRecursivo(12);
        miArbol.instertarNodoRecursivo(11);

        miArbol.recorrerAnchura();
        miArbol.recorrerPreOrden(miArbol.raiz);
        miArbol.recorrerOrden(miArbol.raiz);
    }
}