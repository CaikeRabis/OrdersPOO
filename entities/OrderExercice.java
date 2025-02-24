package entities;

import entities.enums.OrderStatus;

import java.util.Date;

public class OrderExercice {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private OrderItem orderItem;
    private Product product;

    public OrderExercice() {}
    public OrderExercice(OrderStatus status, Client client,OrderItem orderItem, Product product) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
        this.orderItem = orderItem;
        this.product = product;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public OrderItem getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem orderItem) {
        this.orderItem = orderItem;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderExercice{" +
                "moment=" + moment +
                ", status=" + status +
                ", client=" + client +
                ", orderItem=" + orderItem +
                ", product=" + product +
                '}';
    }
}
