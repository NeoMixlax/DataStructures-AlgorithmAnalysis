public class Main {
    public static void main(String[] args) {
        Lista miLista = new Lista();
        System.out.println(miLista.getTamano());
        miLista.agregarInicio(12);
        miLista.imprimirLista();
        System.out.println(miLista.getTamano());
        miLista.agregarInicio(10);
        miLista.imprimirLista();
        System.out.println(miLista.getTamano());
        miLista.agregarFinal(20);
        miLista.imprimirLista();
        System.out.println(miLista.getTamano());
        miLista.agregarPosicion(11, 0);
        miLista.imprimirLista();
        System.out.println(miLista.getTamano());
        System.out.println(miLista.buscarNodo(2));
        System.out.println(miLista.buscarPosicion(11));
        miLista.eliminarInicio();
        miLista.imprimirLista();
        System.out.println(miLista.getTamano());
        miLista.eliminarPosicion(1);
        miLista.imprimirLista();
        System.out.println(miLista.getTamano());
    }
}
