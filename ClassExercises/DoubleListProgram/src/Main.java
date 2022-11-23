public class Main {
    public static void main(String[] args) {
        ListaDoble miLista = new ListaDoble();
        miLista.imprimirListaInAFin();
        miLista.imprimirListaFinAIn();
        System.out.println(miLista.getTamano());

        miLista.instertarNodoInicio(3);
        miLista.imprimirListaInAFin();
        miLista.imprimirListaFinAIn();
        System.out.println(miLista.getTamano());

        miLista.insertarNodoFinal(5);
        miLista.imprimirListaInAFin();
        miLista.imprimirListaFinAIn();
        System.out.println(miLista.getTamano());

        miLista.intertarNodoPosicion(4, 1);
        miLista.imprimirListaInAFin();
        miLista.imprimirListaFinAIn();
        System.out.println(miLista.getTamano());

        miLista.insertarNodoFinal(6);
        miLista.imprimirListaInAFin();
        miLista.imprimirListaFinAIn();
        System.out.println(miLista.getTamano());

        miLista.eliminarNodoInicio();
        miLista.imprimirListaInAFin();
        miLista.imprimirListaFinAIn();
        System.out.println(miLista.getTamano());
        System.out.println(miLista.buscarNodo(1));

        miLista.eliminarPosicion(1);
        miLista.imprimirListaInAFin();
        miLista.imprimirListaFinAIn();
        System.out.println(miLista.getTamano());
    }
}
