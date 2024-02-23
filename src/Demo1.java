import java.util.Scanner;

//Q1 Take values of length and breadth of a rectangle from user and check if it is square or not.
public  class Demo1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of square");
        double length = scan.nextDouble();

        System.out.println("Enter the breadth of square");
        double breadth = scan.nextDouble();

        if(length == breadth){
            System.out.println("It is Square");
        }else {
            System.out.println("It is not Square");
        }

    }
}