public class task6 {
    public static void main(String[] args) {
        String[][] laptops = {
            {"Sony", "4000.00"},
            {"HP", "2000.00"},
            {"Asus", "2500.00"},
            {"Acer", "1900.00"},
            {"Mac", "7000.00"}
        };

        System.out.printf("%-10s %-12s %-16s%n", "Brands", "Price", "After Discount");
        System.out.println("------------------------------------------");

        for (int i = 0; i < laptops.length; i++) {
            String brand = laptops[i][0];
            double price = Double.parseDouble(laptops[i][1]);
            double discountedPrice = price * 0.90; 

            System.out.printf("%-10s RM%-10.2f RM%-15.2f%n", brand, price, discountedPrice);
        }
    }
}
