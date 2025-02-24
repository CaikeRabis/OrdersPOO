package entities;

public class OrderItem {
    private Product product;
    private Integer quantity;
    private double subTotal;
    private double totalPrice;

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
        this.subTotal = 0;
        this.totalPrice = 0;
    }

    public void subTotalCalculator () {
        subTotal = quantity * product.getPrice();
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return product.getPrice();
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return product.getName() + ", $" + product.getPrice() + ", Quantity: " + quantity + ", " +
                "Subtotal: R$" + subTotal;
    }
}
