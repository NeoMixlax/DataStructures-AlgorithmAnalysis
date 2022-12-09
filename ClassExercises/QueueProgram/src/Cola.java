public class Cola {
    private Nodo inicio;
    private Nodo fin;
    private int tamano;

    public Cola() {
        inicio = fin = null;
        tamano = 0;
    }

    public void enqueue(int dato){
        Nodo nuevo = new Nodo(dato);

        if(isEmpty()){
            inicio = nuevo;
        } else{
            fin.siguiente = nuevo;
        }
        fin = nuevo;
        tamano++;
    }

    public int dequeue(){
        Nodo aux = inicio;
        if(inicio.siguiente == null){
            aux = inicio;
            inicio = fin = null;
        } else{
            inicio = inicio.siguiente;
            aux.siguiente = null;
        }
        tamano--;
        return aux.dato;
    }

    public boolean isEmpty(){
        if(inicio == null){
            return true;
        } else{
            return false;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("No hay datos en la cola");
            return -1;
        }
        System.out.println("El primero en la cola es "+inicio.dato);
        return inicio.dato;
    }

    public void eliminarCola(){
        while(!isEmpty()){
            dequeue();
        }
    }
}
