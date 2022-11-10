import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int[] intsPrueba = {3, 2, 1};
        System.out.println(Arrays.toString(ordenarNumeros(intsPrueba, "Ascendente")));
        System.out.println("===============");
        System.out.println(Arrays.toString(ordenarNumeros(intsPrueba, "Descendente")));*/

        String[] strPrueba = {"Hola", "Holo", "Hello"};
        System.out.println(Arrays.toString(ordenarStrings(strPrueba, "Ascendente")));
        System.out.println("===============");
        System.out.println(Arrays.toString(ordenarStrings(strPrueba, "Descendente")));

    }

    public static int[] ordenarNumeros (int[] vector, String tipoOrden){
        int aux;
        int[] result;
        for(int j=0;j<vector.length;j++){
            for(int i=0; i<vector.length-1; i++) {
                if (vector[i] > vector[i + 1]) {
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                }
            }
        }
        result = java.util.Arrays.copyOf(vector, vector.length);
        if(tipoOrden.equals("Descendente")){
            for(int i=vector.length-1; i>=0; i--){
                result[vector.length-i-1] = vector[i];
            }
        }
        return result;
    }

    public static String[] ordenarStrings (String[] vector, String tipoOrden){
        String aux;
        String[] result;
        for(int j=0;j<vector.length;j++){
            for(int i=0; i<vector.length-1; i++) {
                if(vector[i].compareTo(vector[i+1])>0){
                    aux = vector[i];
                    vector[i] = vector[i + 1];
                    vector[i + 1] = aux;
                }
            }
        }
        result = java.util.Arrays.copyOf(vector, vector.length);
        if(tipoOrden.equals("Descendente")){
            for(int i=vector.length-1; i>=0; i--){
                result[vector.length-i-1] = vector[i];
            }
        }
        return result;
    }
}
