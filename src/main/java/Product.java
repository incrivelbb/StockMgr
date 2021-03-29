import java.math.BigDecimal;
import java.util.ArrayList;

public class Product {

    ArrayList<String> productList = new ArrayList<>();

    String name;
    String description;
    String category;
    BigDecimal price;
    int quantity;
    int productId;

    private static int id = 1;


    public Product() { }

    public Product(String name, String description, String category, BigDecimal price, int quantity) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.quantity = quantity;

        this.productId = getGeneratedId();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        productList.add(name);
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        productList.add(description);
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        productList.add(category);
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        productList.add(String.valueOf(price));
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        productList.add(String.valueOf(quantity));
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        productList.add(String.valueOf(id));
        this.productId = productId;
    }

    private static int getGeneratedId(){
        return id++;
    }

}
