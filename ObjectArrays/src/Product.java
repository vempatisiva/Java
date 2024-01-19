

public class Product implements Comparable<Product> {
    private double weight;
    private double price;
    private int id;

   
    public Product(double weight, double price, int id) {
        this.weight = weight;
        this.price = price;
        this.id = id;
    }

    // Getter methods

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }


    @Override
    public int compareTo(Product otherProduct) {
        // Compare Product based on their price
        return Double.compare(this.price, otherProduct.price);
    }


    @Override
    public String toString() {
        return "Product{" +
                "weight=" + weight +
                ", price=" + price +
                ", id=" + id +
                '}';
    }

    // Example usage
    public static void main(String[] args) {

        Product product1 = new Product(1.5, 25.99, 101);
        Product product2 = new Product(2.0, 19.99, 102);
       // Product product3 = new Product(1.0, 29.99, 103);

        int result = product1.compareTo(product2);
        //System.out.println(result);

        if (result < 0) {
            System.out.println(product1 + " is cheaper than " + product2);
        } else if (result > 0) {
            System.out.println(product1 + " is more expensive than " + product2);
        } else {
            System.out.println(product1 + " has the same price as " + product2);
        }
    }
}