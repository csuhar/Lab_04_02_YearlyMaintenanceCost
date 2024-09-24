import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         double springCost, summerCost, fallCost, winterCost;


        System.out.println("Enter the maintenance cost for spring: $");
        springCost = in.nextDouble();
        System.out.println("Enter the maintenance cost for summer: $");
        summerCost = in.nextDouble();
        System.out.println("Enter the maintenance cost for fall: $");
        fallCost = in.nextDouble();
        System.out.println("Enter the maintenance cost for winter: $");
        winterCost = in.nextDouble();

        double totalCost= springCost + summerCost + fallCost + winterCost;

        System.out.println("Your yearly maintenance cost is: $" + totalCost);
    }
}