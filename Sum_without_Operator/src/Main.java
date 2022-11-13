import java.util.Scanner;

public class Main {
    //user defined method which calculate the sum of two numbers
    static int sum(int x, int y)
    {
        int carry = x & y;
        x = x^y;
        y = carry<<1;
        return x;
    }
    public static void main(String[] args) {

        //declare two numbers to store the numbers
        int num1, num2;

        //parsing
        Scanner sc = new Scanner(System.in);

        //taking number 1 from user
        System.out.print("Please enter the num 1 : ");
        num1 = sc.nextInt();

        //taking number 2 from user
        System.out.print("Please enter the num2 : ");
        num2 = sc.nextInt();

        //call the sum method and show the sum of numbers
        System.out.println("Sum of "+num1+"  and "+num2+" is : "+sum(num1,num2));
    }
}