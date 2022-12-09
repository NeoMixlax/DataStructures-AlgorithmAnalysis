public class Main {

    public static void main(String[] args) {
        Lista miLista = new Lista();

        miLista.agregarInicio(12);
        miLista.imprimirLista();
        System.out.println("");
        miLista.agregarInicio(10);
        miLista.imprimirLista();
        System.out.println("");
        miLista.agregarFinal(20);
        miLista.imprimirLista();
        System.out.println("");
        miLista.agregarPosicion(3, 3);
        miLista.imprimirLista();
        System.out.println("");

        miLista.moverFinalInicio();
        miLista.imprimirLista();

    }
}