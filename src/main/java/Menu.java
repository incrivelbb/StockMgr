import java.math.BigDecimal;
import java.util.*;


public class Menu {

    public static void menu() {
        System.out.println("----------------------------------------------------------------");
        System.out.println("\tWelcome to Stock Manager! Please choose an option below:");
        System.out.println("----------------------------------------------------------------");
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
                case 0:
                    System.out.println("Good Bye!");
                    System.exit(0);

                case 1:
                    addProduct();
                    break;

                case 2:
                    editProduct();
                    break;

                case 3:
                    Menu.deleteProduct();
                    break;

                case 4:
                    Menu.searchProduct();
                    break;

                default:
                    System.out.println("Invalid Option, please choose another one!.");
            }
        } while (true);
    }

    public static void addProduct() {

        Product product = new Product();
        Scanner entry = new Scanner(System.in);

        System.out.println("Please insert the product's name");
        String name = entry.next();
        product.setName(name);

        System.out.println("Please insert the product's description");
        String description = entry.next();
        product.setDescription(description);


        System.out.println("Please insert the product's price");

        boolean placeholder = false;

        do {
            if (entry.hasNextBigDecimal()) {
                BigDecimal price = entry.nextBigDecimal();
                product.setPrice(price);

                placeholder = true;

            } else {

                System.out.println("Please insert a valid amount");
                entry.next();
            }
        } while (!placeholder);

        System.out.println("Please insert the product's quantity");

        placeholder = false;

        do {

            if (entry.hasNextInt()) {
                int quantity = entry.nextInt();
                product.setQuantity(quantity);

                placeholder = true;

            } else {
                System.out.println("Please insert a valid amount");
                entry.next();
            }
        } while (!placeholder);


        System.out.println( product.getName() + product.getDescription() + product.getPrice() + product.getQuantity());

        System.out.println("Please insert the product's category");
        String category = entry.next();
        product.setCategory(category);

        product.setProductId(product.productId);

    }


    public static void editProduct(){
        System.out.println("Edit product.");
    }

    public static void deleteProduct(){
        System.out.println("Delete Product");
    }

    public static void searchProduct(){
        System.out.println(Product.productList);
    }
}


