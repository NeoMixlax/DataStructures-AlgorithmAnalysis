public class Main {

    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(OptimizedFibonacci(i, 1, 0));
        }
    }

    public static int OptimizedFibonacci(int n, int valor, int anterior){
        if(n==0){
            return anterior;
        }
        return OptimizedFibonacci(n-1, valor+anterior, valor); // La suma se va contabilizando en el tercer parámetro y ese es el que se retorna al final
    }
}
