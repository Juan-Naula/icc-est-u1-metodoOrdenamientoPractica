public class SortIsertion {
    public SortIsertion(){

    }
    public static void sortIser(int[] numeros, boolean orden, boolean pasos){
        if (orden) {
            isertionAscen(numeros, pasos);
        }else{
            isertionDescen(numeros, pasos);
        }

    }

    private static void isertionAscen(int[] numeros, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int comparacionNumero = 1;
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int temp = numeros[i];
            while (j >= 0 && numeros[j] > temp) {
                comparaciones++;
                if (pasos)
                    System.out.println("Comparacion " + comparacionNumero + ": temp " + temp + " comparado con numeros[" + j + "] " + numeros[j]);
                // shift
                numeros[j+1] = numeros[j];
                cambios++; // movimiento
                if (pasos)
                    System.out.println("Intercambio: Mueve " + numeros[j] + " -> posicion " + (j+1));
                if (pasos)
                    printEstado(numeros);
                j--;
                comparacionNumero++;
            }
            // la comparación que rompe el while también cuenta (si j>=0)
            if (j >= 0) {
                comparaciones++;
            }
            numeros[j+1] = temp;
            cambios++; // insercion
            if (pasos) {
                System.out.println("Intercambio: Inserta " + temp + " en posicion " + (j+1));
                printEstado(numeros);
            }
        }
        if (pasos) {
            System.out.println("Comparaciones Totales -> " + comparaciones);
            System.out.println("Cambios Totales -> " + cambios);
        }
    }

    private static void isertionDescen(int[] numeros, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int comparacionNumero = 1;
        for (int i = 1; i < numeros.length; i++) {
            int j = i - 1;
            int temp = numeros[i];
            while (j >= 0 && numeros[j] < temp) {
                comparaciones++;
                if (pasos)
                    System.out.println("Comparacion " + comparacionNumero + ": temp " + temp + " comparado con numeros[" + j + "] " + numeros[j]);
                // shift
                numeros[j+1] = numeros[j];
                cambios++; // movimiento
                if (pasos)
                    System.out.println("Intercambio: Mueve " + numeros[j] + " -> posicion " + (j+1));
                if (pasos)
                    printEstado(numeros);
                j--;
                comparacionNumero++;
            }
            if (j >= 0) {
                comparaciones++;
            }
            numeros[j+1] = temp;
            cambios++; // insercion
            if (pasos) {
                System.out.println("Intercambio: Inserta " + temp + " en posicion " + (j+1));
                printEstado(numeros);
            }
        }
        if (pasos) {
            System.out.println("Comparaciones Totales -> " + comparaciones);
            System.out.println("Cambios Totales -> " + cambios);
        }
    }

    public static void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i<numeros.length-1) {
                System.out.print(numeros[i] + ", ");
            }
            else{
                System.out.print(numeros[i]);
            }
        }
        System.out.println("]");
    }

    private static void printEstado(int[] numeros){
        System.out.print("Estado actual -> ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
