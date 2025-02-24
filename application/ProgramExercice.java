package application;

import entities.Client;
import entities.OrderExercice;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ProgramExercice {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        double totalPriceOrder = 0;

        System.out.print("Name: ");
        String nameClient = scanner.next();
        System.out.print("Email: ");
        String emailClient = scanner.next();
        System.out.print("Date birth: ");
        String birthClient = scanner.next();
        Date birthClientTypeDate = formatter.parse(birthClient);
        String birthClietntFormated = formatter.format(birthClientTypeDate);

        Client client = new Client(nameClient, emailClient, birthClietntFormated);

        System.out.print("Enter order data: ");
        String orderStatusClient = scanner.next();
        OrderStatus.valueOf(orderStatusClient);

        System.out.print("How many items to this order: ");
        int quantityProducts = scanner.nextInt();
        Product[] products = new Product[quantityProducts];
        OrderItem[] orderitens = new OrderItem[quantityProducts];
        OrderExercice generalOrder = new OrderExercice();

        for (int i = 0; i < quantityProducts; i++) {
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Name: ");
            String nameProduct = scanner.next();
            System.out.print("Price: ");
            double priceProduct = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantityProductItem = scanner.nextInt();
            products[i] = new Product(nameProduct, priceProduct);
            orderitens[i] = new OrderItem(quantityProductItem, products[i]);
            orderitens[i].subTotalCalculator();
            totalPriceOrder += orderitens[i].getSubTotal();
            orderitens[i].setTotalPrice((orderitens[i].getTotalPrice() + totalPriceOrder));
            generalOrder.setMoment(new Date());
            generalOrder.setStatus(OrderStatus.valueOf(orderStatusClient));
            generalOrder.setClient(client);
            generalOrder.setOrderItem(orderitens[i]);
            generalOrder.setProduct(products[i]);
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.print("Order moment: ");
        System.out.println(generalOrder.getMoment());
        System.out.print("Order status: ");
        System.out.println(generalOrder.getStatus());
        System.out.print("Client: ");
        System.out.println(generalOrder.getClient());

        System.out.println();
        System.out.println("Order Items:");
        for (OrderItem x : orderitens) {
            System.out.println(x);
        }
        System.out.println("Total Price: " + totalPriceOrder);
    }
}
