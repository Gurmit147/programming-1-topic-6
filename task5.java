import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        double sales[] = new double[7];
        double total=0, average=0;
        int counter = 0;
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for day " + (i + 1) + ": ");
            sales[i] = sc.nextDouble();
            if(sales[i]>100){
                counter++;
            }

        }

        for(int i = 0; i < sales.length; i++) {
            total += sales[i];
        }
        average = total / sales.length;
        System.out.printf("Total sum for this week is: RM %.2f%n", total);
        System.out.printf("The average of sales for this week is: RM%.2f%n", average);
        System.out.println("In this week, the total sales exceeded RM 100 for " + counter + " times");
    }
}
