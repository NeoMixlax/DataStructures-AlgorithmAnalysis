import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(OptimizedFibonacci(i));
        }

    }

    public static int OptimizedFibonacci(int n){
        if(n==1){
            return 1;
        } else{
            ArrayList<Integer> fibos = new ArrayList<>();
            fibos.add(0); fibos.add(1);
            for(int i = 2; i<=n;i++){
                fibos.add(fibos.get(i-1)+fibos.get(i-2)); //We add the fibos we're getting, scaling till the number required.
            }
            return fibos.get(n);
        }
    }
}
