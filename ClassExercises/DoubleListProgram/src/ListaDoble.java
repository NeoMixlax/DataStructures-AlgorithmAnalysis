public class ListaDoble {
    private NodoDoble cabeza, cola;
    private int tamano;

    public ListaDoble(){
        this.cabeza = null;
        this.cola = null;
    }

    public int getTamano() {
        return tamano;
    }

    public boolean estaVacia(){
        if(cabeza==null){
            return true;
        } else {
            return false;
        }
    }

    public void imprimirListaInAFin(){
        NodoDoble nodoRecorre = cabeza;

        System.out.print("CABEZA -> ");
        while(nodoRecorre!= null){
            System.out.print(nodoRecorre.dato+" -> ");
            nodoRecorre = nodoRecorre.siguiente;
        }
        System.out.println("FINAL");
    }

    public void imprimirListaFinAIn(){
        NodoDoble nodoRecorre = cola;

        System.out.print("FINAL -> ");
        while(nodoRecorre!=null){
            System.out.print(nodoRecorre.dato+" -> ");
            nodoRecorre = nodoRecorre.anterior;
        }
        System.out.println("CABEZA");
    }

    public void instertarNodoInicio(int dato){
        NodoDoble nuevo = new NodoDoble(dato);
        if(estaVacia()){
            cola = nuevo;
        } else {
            cabeza.anterior = nuevo;
        }
        nuevo.siguiente = cabeza;
        nuevo.anterior = null;

        cabeza = nuevo;
        tamano++;
    }

    public void insertarNodoFinal(int dato){
        NodoDoble nuevo = new NodoDoble(dato);

        if(estaVacia()){
            cabeza = nuevo;
        } else{
            cola.siguiente = nuevo;
            nuevo.anterior = cola;
        }

        cola = nuevo;
        tamano++;
    }

    public void intertarNodoPosicion(int dato, int pos){
        NodoDoble nuevo = new NodoDoble(dato);
        NodoDoble recorre;

        if(estaVacia() && pos!=0){
            System.out.println("Posición no existe");
        } else if(estaVacia() && pos == 0){
            cabeza = nuevo;
            tamano++;
        } else {
            recorre = cabeza;
            int cont = 0;
            while(cont <pos-1 && recorre.siguiente != null){
                recorre = recorre.siguiente;
                cont++;
            }

            if(cont==pos-1){
                nuevo.siguiente = recorre.siguiente;
                recorre.siguiente.anterior = nuevo;
                recorre.siguiente = nuevo;
                nuevo.anterior = recorre;
                tamano++;
            } else {
                System.out.println("Posición no existente");
            }
        }
    }

    public void eliminarNodoInicio(){
        if(estaVacia()){
            System.out.println("Nada por eliminar");
        } else if(cabeza==cola){
            cola = null;
            cabeza = null;
        } else{
            cabeza = cabeza.siguiente;
            cabeza.anterior = null;
            tamano--;
        }
    }

    public void eliminarNodoFinal(){
        if(estaVacia()){
            System.out.println("Nada por eliminar");
        } else if(cabeza==cola){
            cola = null;
            cabeza = null;
            tamano--;
        } else{
            cola = cola.anterior;
            cola.siguiente = null;
            tamano--;
        }
    }

    public void eliminarPosicion(int pos){
        NodoDoble recorre;

        if(estaVacia()){
            System.out.println("Nada por eliminar");
        } else if(pos >= tamano){
            System.out.println("Posición no existente");
        } else if(cabeza == cola){
            cola = null;
            cabeza = null;
            tamano--;
        } else {
            recorre = cabeza;
            int cont = 0;
            while(cont <pos-1 && recorre.siguiente != null){
                recorre = recorre.siguiente;
                cont++;
            }

            if(cont==pos-1){
                recorre.siguiente = recorre.siguiente.siguiente;
                if(recorre.siguiente!=null){
                    recorre.siguiente.anterior = recorre;
                }
                tamano--;
            } else {
                System.out.println("Posición no existente");
            }
        }
    }

    public int buscarNodo(int posicion){
        NodoDoble recorre = cabeza;
        int cont = 0;
        while(cont <posicion && recorre.siguiente != null){
            recorre = recorre.siguiente;
            cont++;
        }
        if(cont == posicion){
            return recorre.dato;
        } else{
            System.out.println("Posición no existe");
            return -1;
        }
    }

    public int buscarValor(int val){
        NodoDoble recorre = cabeza;
        int cont = 0;
        while(recorre.dato!=val && recorre.siguiente!=null){
            recorre = recorre.siguiente;
            cont++;
        }

        if(recorre.dato==val){
            return cont;
        } else {
            System.out.println("Dato no existe");
            return 0;
        }
    }
}
