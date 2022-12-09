import java.util.LinkedList;
import java.util.Queue;

public class StackWithQueue {
    Queue<Integer> myQueue = new LinkedList<Integer>();

    public void push(int n){
        myQueue.add(n);

        //removemos y añadimos todos los elementos para que vayan después de n

        for(int i=0; i<myQueue.size()-1; i++){
            myQueue.add(myQueue.remove()); // Añadimos los mismos que vamos quitando
        }
    }

    public void pop(){
        if(myQueue.isEmpty()){
            System.out.println("No hay nada que remover");
        } else{
            myQueue.remove();
        }
    }

    public int peek(){
        if(myQueue.isEmpty()){
            System.out.println("No hay nada que mostrar");
            return -1;
        } else {
            return myQueue.peek();
        }
    }

    public int size(){
        return myQueue.size();
    }

}
