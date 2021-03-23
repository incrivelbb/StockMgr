import java.util.Scanner;

public class Menu {

        public static void menu(){
            System.out.println("\tWelcome to Stock Manager! Please choose an option below:");
            System.out.println("0. End Session");
            System.out.println("1. Add product");
            System.out.println("2. Edit an existing product");
            System.out.println("3. Delete a product");
            System.out.println("4. Search");
            System.out.println("Please, select and option and press ENTER:");
        }

        public static void addProduct(){
            System.out.println("Add product");
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

        public static void main(String[] args) {
            int opcao;
            Scanner entrada = new Scanner(System.in);

            do{
                menu();
                opcao = entrada.nextInt();

                switch(opcao){
                    case 1:
                        addProduct();
                        break;

                    case 2:
                        editProduct();
                        break;

                    case 3:
                        deleteProduct();
                        break;

                    case 4:
                        searchProduct();
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            } while(opcao != 0);
        }
    }

