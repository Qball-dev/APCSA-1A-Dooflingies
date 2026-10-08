import java.util.Scanner;

public class Dooflingies {
    public static void main(String[] args) {
        // WRITE YOUR CODE HERE
        Scanner input = new Scanner(System.in);

        int huge = 50;
        int large = 20;
        int medium = 5;
        int small = 1;
        int hugeCount = 0;
        int largeCount = 0;
        int mediumCount = 0;
        int smallCount = 0;

          System.out.print("ENTER AMOUNT OF DOOFLINGIES TO SHIP: ");
          int amount = input.nextInt();
          int totalAmount = amount;

          //The code below (lines 22-30) extend the length of the line of = signs according to the amount of digits.
        String amountStr = amount + "";
        int digits = amountStr.length();
        String addedLine = "";
        while(digits > 0){
            addedLine += "=";
            digits--;
        }

        System.out.println("=====================================" + addedLine);
        if(amount - huge >= 0){
            while(amount - huge >= 0){
                amount = amount - huge;
                hugeCount++;
            }
        }

        if(amount - large >= 0){
            while(amount - large >= 0){
                amount = amount - large;
                largeCount++;
            }
        }

        if(amount - medium >= 0){
            while(amount - medium >= 0){
                amount = amount - medium;
                mediumCount++;
            }
        }

        if(amount - small >= 0){
            while(amount - small >= 0){
                amount = amount - small;
                smallCount++;
            }
        }

        System.out.println("NUMBER OF DOOFLINGIES TO SHIP: "+totalAmount);
        System.out.println("HUGE BOXES NEEDED: " + hugeCount);
        System.out.println("LARGE BOXES NEEDED: " + largeCount);
        System.out.println("MEDIUM BOXES NEEDED: " + mediumCount);
        System.out.println("SMALL BOXES NEEDED: " + smallCount);

    }
}
