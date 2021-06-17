package BTVN;

public class Products {

    private int productID;
    private String productName;
    private int numberOfProduct;
    private double price;
    private String msg;

    public Products(int productID, String productName, int numberOfProduct, double price) {
        this.productID = productID;
        this.productName = productName;
        this.numberOfProduct = numberOfProduct;
        this.price = price;
    }

    public Products(String msg) {
        this.msg = msg;
        System.out.println(msg);
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberOfProduct() {
        return numberOfProduct;
    }

    public void setNumberOfProduct(int numberOfProduct) {
        this.numberOfProduct = numberOfProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "productID=" + productID +
                ", productName='" + productName +
                ", numberOfProduct=" + numberOfProduct +
                ", price=" + price;
    }
}
