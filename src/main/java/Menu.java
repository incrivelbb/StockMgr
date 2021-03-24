import java.util.*;


public class Menu {

    public static void menu() {
        System.out.println("\tWelcome to Stock Manager! Please choose an option below:");
        System.out.println("0. End Session");
        System.out.println("1. Add product");
        System.out.println("2. Edit an existing product");
        System.out.println("3. Delete a product");
        System.out.println("4. Search");
        System.out.println("Please, select and option and press ENTER:");
    }

        public static void mainMenu() {

        int selectedOption;
        Scanner entry = new Scanner(System.in);

        do {
            menu();
            selectedOption = entry.nextInt();

            switch (selectedOption) {
                case 1:
                    addProduct();
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
        } while (selectedOption != 0);
    }

        public static void addProduct() {
            System.out.println("Please insert the product's name");

            Product product = new Product();

            Scanner entry = new Scanner(System.in);
            String name = entry.next();

            product.setName(name);

    }

        public static void editProduct(){
            System.out.println("Edit product.");
        }

        public static void deleteProduct(){
            System.out.println("Delete Product");
        }

        public static void searchProduct(){
            System.out.println("Você entrou no método Consulta.");
        }

}


