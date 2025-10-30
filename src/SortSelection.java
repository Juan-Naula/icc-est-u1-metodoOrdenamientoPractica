public class SortSelection {
    public SortSelection(){

    }

    public static void sort(int[] numeros, boolean orden, boolean pasos){
        if (orden) {
            sortAscendente(numeros, pasos);
        }else{
            sortDescendente(numeros, pasos);
        }

    }

    private static void sortAscendente(int[] numeros, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int comparacionNumero = 1;
        for (int i = 0; i < numeros.length; i++) {
            int posMenor = i;
            for (int j = i+1; j < numeros.length; j++) {
                // cada comparación entre numeros[j] y numeros[posMenor]
                comparaciones++;
                if (numeros[j] < numeros[posMenor]) {
                    if (pasos)
                        System.out.println("Comparacion " + comparacionNumero + ": valor mínimo encontrado " + numeros[j] + " en posición " + j);
                    posMenor = j;
                    comparacionNumero++;
                }
            }
            if (i != posMenor) {
                if (pasos)
                    System.out.println("Intercambio: " + numeros[i] + " <-> " + numeros[posMenor]);
                int temp = numeros[posMenor];
                numeros[posMenor] = numeros[i];
                numeros[i] = temp;
                cambios++;
                if (pasos) {
                    printEstado(numeros);
                }
            }
        }
        if (pasos) {
            System.out.println("Comparaciones Totales -> " + comparaciones);
            System.out.println("Cambios Totales -> " + cambios);
        }
    }

    private static void sortDescendente(int[] numeros, boolean pasos){
        int comparaciones = 0;
        int cambios = 0;
        int comparacionNumero = 1;
        for (int i = 0; i < numeros.length; i++) {
            int posMayor = i;
            for (int j = i+1; j < numeros.length; j++) {
                comparaciones++;
                if (numeros[j] > numeros[posMayor]) {
                    if (pasos)
                        System.out.println("Comparacion " + comparacionNumero + ": valor máximo encontrado " + numeros[j] + " en posición " + j);
                    posMayor = j;
                    comparacionNumero++;
                }
            }
            if (i != posMayor) {
                if (pasos)
                    System.out.println("Intercambio: " + numeros[i] + " <-> " + numeros[posMayor]);
                int temp = numeros[posMayor];
                numeros[posMayor] = numeros[i];
                numeros[i] = temp;
                cambios++;
                if (pasos) {
                    printEstado(numeros);
                }
            }
        }
        if (pasos) {
            System.out.println("Comparaciones Totales -> " + comparaciones);
            System.out.println("Cambios Totales -> " + cambios);
        }
    }

    private static void printEstado(int[] numeros){
        System.out.print("Estado actual -> ");
        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i]);
            if (i < numeros.length - 1) System.out.print(" ");
        }
        System.out.println();
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
}
