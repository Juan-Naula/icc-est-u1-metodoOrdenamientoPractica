public class App {
    public static void main(String[] args) throws Exception {
       
        View view = new View();
        SortSelection sortSelection = new SortSelection();
        SortBubbleMejorado sortBubble = new SortBubbleMejorado();
        SortIsertion sortIsertion = new SortIsertion();
        int[] numeros = new int[] {12, 4, 8, -3, 15, 0, 7, 2};
        while (true) {
            view.showMenu();
            int option = view.inputOption(4);
            if (option == 4) {
                System.out.println("Adios");
                System.exit(0);
            }
            view.showOrder();
            int orden = view.inputOption(2);
            view.showPasosMenu();
            int pasos = view.inputOption(2);
            switch (option) {
                case 1:
                    System.out.println("Metodo Selección");
                    System.out.println("Array Original");
                    sortSelection.printArray(numeros);
                    sortSelection.sort(numeros, orden==1, pasos==1);
                    System.out.println("Ordenado");
                    sortSelection.printArray(numeros);
                    break;
                case 2:
                    
                    System.out.println("Metodo Inserción");
                    System.out.println("Array Original");
                    sortIsertion.printArray(numeros);
                    sortIsertion.sortIser(numeros, orden==1, pasos==1);
                    System.out.println("Ordenado");
                    sortIsertion.printArray(numeros);
                    break;

                case 3:
                    
                    System.out.println("Metodo Burbuja");
                    System.out.println("Array Original");
                    sortBubble.printArray(numeros);
                    sortBubble.bubbleMejorado(numeros, orden==1, pasos==1);
                    System.out.println("Ordenado");
                    sortBubble.printArray(numeros);
                    break;
                case 4:

                    System.out.println("Adios");
                    
                    System.exit(0);

                    break;        
            
                default:
                    break;
            }
        }
        
    }
}
