public class App {
    public static void main(String[] args) throws Exception {
       
        View view = new View();
        SortSelection sortSelection = new SortSelection();
        SortBubbleMejorado sortBubble = new SortBubbleMejorado();
        SortIsertion sortIsertion = new SortIsertion();
        int[] numeros = new int[] {1, 3 , 7, 8 ,3 ,8};
        while (true) {
            view.showMenu();
            int option = view.inputOption(4);
            view.showOrder();
            int orden = view.inputOption(2);
            view.showPasosMenu();
            int pasos = view.inputOption(2);
            switch (option) {
                case 1:
                    System.out.println("Metodo Selección");
                    sortSelection.sort(numeros, orden==1, pasos==1);
                    break;
                case 2:
                    
                    System.out.println("Metodo Inserción");
                    sortIsertion.sortIser(numeros, orden==1, pasos==1);
                    break;
                case 3:
                    
                    System.out.println("Metodo Burbuja");
                    sortBubble.bubbleMejorado(numeros, orden==1, pasos==1);
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
