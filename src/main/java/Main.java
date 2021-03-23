import java.util.Scanner;


public class Main {
    public static void main (String[] args) {
        int selectedOption;
        Scanner entry = new Scanner(System.in);

        do{
            Menu.menu();
            selectedOption = entry.nextInt();

            switch(selectedOption){
                case 1:
                    Menu.addProduct();
                    break;

                case 2:
                    Menu.editProduct();
                    break;

                case 3:
                    Menu.deleteProduct();
                    break;

                case 4:
                    Menu.searchProduct();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while(selectedOption != 0);

    }
}
