import java.util.Scanner;

public class TraceOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] penPrice = {2.00, 12.00, 50.00, 30.00};
        double[] bookPrice = new double[4];
        double[] markerPrice = new double[4];
        double[] totalPrice = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter price for book " + (i + 1) + ": ");
            bookPrice[i] = scan.nextDouble();
        }

        for (int i = 0; i < markerPrice.length; i++) {
            System.out.print("Enter price for marker " + (i + 1) + ": ");
            markerPrice[i] = scan.nextDouble();
        }

        for (int i = 0; i < totalPrice.length; i++) {
            totalPrice[i] = bookPrice[i] + markerPrice[i] + penPrice[i];
            System.out.printf(
                "The total price for pen, book and marker at totalPrice[%d] is RM %.2f%n",
                i, totalPrice[i]
            );
        }
        scan.close();
    }
}