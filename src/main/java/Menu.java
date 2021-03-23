import org.junit.Test;

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
    }

