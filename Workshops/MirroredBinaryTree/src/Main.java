
public class Main {

    public static void main(String[] args) {
	    BinaryTree miArbol = new BinaryTree();

	    miArbol.insertarNodo(4);
        miArbol.insertarNodo(8);
        miArbol.insertarNodo(9);
        miArbol.insertarNodo(5);
        miArbol.insertarNodo(3);

        miArbol.raiz = miArbol.mirror(miArbol.raiz);

        miArbol.recorrerOrden(miArbol.raiz);
    }

}
