public class SortBubbleMejorado {
    public SortBubbleMejorado(){

    }

    public static void bubbleMejorado(int[] numeros, boolean orden, boolean pasos) {
        if (orden) {
            bubbleAscen(numeros, pasos);
        }else{
            bubbleDescen(numeros, pasos);
        }
    }

    private static void bubbleAscen(int[] numeros, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int comparacionNumero = 1;
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                // cada comparación adyacente
                comparaciones++;
                if (numeros[j] > numeros[j+1]) {
                    if (pasos)
                        System.out.println("Comparacion " + comparacionNumero + ": numeros[" + j + "] (" + numeros[j] + ") > numeros[" + (j+1) + "] (" + numeros[j+1] + ")");
                    if (pasos)
                        System.out.println("Intercambio: " + numeros[j] + " <-> " + numeros[j+1]);
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    cambios++;
                    swapped = true;
                    if (pasos) {
                        printEstado(numeros);
                    }
                    comparacionNumero++;
                }
            }
            if (!swapped) {
                if (pasos)
                    System.out.println("No hubo swaps en la pasada i=" + i + ", el arreglo ya está ordenado.");
                break;
            }
        }
        if (pasos) {
            System.out.println("Comparaciones Totales -> " + comparaciones);
            System.out.println("Cambios Totales -> " + cambios);
        }

    }
    private static void bubbleDescen(int[] numeros, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int comparacionNumero = 1;
        for (int i = 0; i < numeros.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                comparaciones++;
                if (numeros[j] < numeros[j+1]) {
                    if (pasos)
                        System.out.println("Comparacion " + comparacionNumero + ": numeros[" + j + "] (" + numeros[j] + ") < numeros[" + (j+1) + "] (" + numeros[j+1] + ")");
                    if (pasos)
                        System.out.println("Intercambio: " + numeros[j] + " <-> " + numeros[j+1]);
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                    cambios++;
                    swapped = true;
                    if (pasos) {
                        printEstado(numeros);
                    }
                    comparacionNumero++;
                }
            }
            if (!swapped) {
                if (pasos)
                    System.out.println("No hubo swaps en la pasada i=" + i + ", el arreglo ya está ordenado.");
                break;
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
