public class Pila {
    private NodoPila cima;
    private int tamano;

    public Pila(){
        this.cima = null;
        this.tamano = 0;
    }

    public void push(int dato){
        NodoPila nuevo = new NodoPila(dato);
        nuevo.siguiente = cima;
        cima = nuevo;
        tamano++;
        System.out.println("Se ingresó el elemento"+dato+" a la pila.");
    }


    public int pop(){
        NodoPila aux = cima;
        cima = cima.siguiente;
        tamano--;
        System.out.println("Se eliminó el elemento"+aux.dato+" de la pila.");
        return aux.dato;
    }

    public int peek(){
        System.out.println("El elemento en la cima de la pila es "+cima.dato);
        return cima.dato;
    }

    public boolean isEmpty(){
        if(cima == null){
            System.out.println("La pila está vacía");
            return true;
        } else{
            System.out.println("La pila no está vacía");
            return false;
        }
    }

    public void eliminarPila(){
        while(isEmpty()){
            pop();
        }
    }

    public int getTamano() {
        return tamano;
    }
}
