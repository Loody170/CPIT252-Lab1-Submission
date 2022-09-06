package Lab1;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
        Product p3 = new FoodProduct(1234, 9.99, "water", null);

        Product p4 = new FoodProduct(3452, 10.0, "Cheddar Cheese",
                LocalDate.parse("2022-06-07"));
        Product p5 = new ElectricProduct(4875, 30.0, "Extension cord", "220v");
        Product[] products = {p3, p4, p5};
        
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

}
