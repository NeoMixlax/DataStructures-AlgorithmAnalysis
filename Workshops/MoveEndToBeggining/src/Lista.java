public class Lista {
    private Nodo cabeza;
    private int tamano;

    public Lista(){
        this.cabeza = null;
        this.tamano = 0;
    }

    public int getTamano() {
        return tamano;
    }

    public boolean estaVacia(){
        if(cabeza.siguiente == null){
            return true;
        } else {
            return false;
        }
    }

    public void agregarInicio(int dato){
        Nodo nodoIni = new Nodo(dato);
        nodoIni.siguiente = cabeza;
        cabeza = nodoIni;
        tamano++;
    }

    public void agregarFinal(int dato){
        Nodo nodoFin = new Nodo(dato);
        Nodo nodoAux = cabeza;
        while(nodoAux.siguiente != null){
            nodoAux = nodoAux.siguiente;
        }
        nodoAux.siguiente = nodoFin;
        tamano++;
    }

    public void agregarPosicion(int dato, int posicion){
        if(posicion == 0){
            agregarInicio(dato);
        } else{
            Nodo nodoPos = new Nodo(dato);
            Nodo nodoAux = cabeza;
            int i = 0;
            while(i<posicion-1 && nodoAux.siguiente!= null){
                nodoAux = nodoAux.siguiente;
                i++;
            }
            if(i==(posicion-1)){
                nodoPos.siguiente = nodoAux.siguiente;
                nodoAux.siguiente = nodoPos;
                tamano++;
            }
        }
    }

    public void imprimirLista(){
        Nodo nodoAux = cabeza;
        while(nodoAux.siguiente != null){
            System.out.print(nodoAux.dato+" -> ");
            nodoAux = nodoAux.siguiente;
        }
        System.out.print(nodoAux.dato+" -> ");
        System.out.print("NULL");
    }

    public void eliminarInicio(){
        cabeza = cabeza.siguiente;
        tamano--;
    }

    public void eliminarFinal(){
        if(cabeza.siguiente==null){
            cabeza=null;
        } else {
            Nodo nodoRecorre = cabeza;
            while(nodoRecorre.siguiente.siguiente != null){
                nodoRecorre = nodoRecorre.siguiente;
            }
            nodoRecorre.siguiente = null;
        }
        tamano--;
    }

    public void eliminarPosicion(int posicion){
        if(cabeza.siguiente!=null){
            Nodo nodoRecorre = cabeza;
            int i = 0;
            while(i<(posicion-1) && nodoRecorre.siguiente.siguiente!= null){
                nodoRecorre = nodoRecorre.siguiente;
                i++;
            }
            nodoRecorre.siguiente = nodoRecorre.siguiente.siguiente;
            tamano--;
        }
    }

    public int buscarNodo(int posicion){
        Nodo nodoRecorre = cabeza;

        int cont = 0;
        while(cont<posicion && nodoRecorre.siguiente!=null){
            nodoRecorre = nodoRecorre.siguiente;
            cont++;
        }
        return nodoRecorre.dato;
    }

    public int buscarPosicion(int dato){
        Nodo nodoRecorre = cabeza;
        int cont = 0;
        while(nodoRecorre.dato!=dato && cabeza.siguiente!=null){
            nodoRecorre = nodoRecorre.siguiente;
            cont++;
        }
        if(nodoRecorre.dato == dato){
            return cont;
        } else {
            return -1;
        }
    }

    public void moverFinalInicio(){
        if(cabeza.siguiente==null){
            System.out.println("No hay nada que cambiar ¯|_(ツ)_/¯");
        } else {
            Nodo nodoRecorre = cabeza;
            while(nodoRecorre.siguiente.siguiente != null){
                nodoRecorre = nodoRecorre.siguiente;
            }
            nodoRecorre.siguiente.siguiente = cabeza;
            cabeza = nodoRecorre.siguiente;
            nodoRecorre.siguiente = null;
        }
    }
}
