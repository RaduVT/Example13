import java.util.Scanner;

class Exercise13{
    public static void main(String[] args){
        int x;
        System.out.println("Enter first number:");

        Scanner inputValue;
        inputValue = new Scanner (System.in);
        x = inputValue.nextInt();

        int y;
        System.out.println("Enter second number:");

        inputValue = new Scanner (System.in);
        y = inputValue.nextInt();

        int z;
        System.out.println("Enter third number:");

        inputValue = new Scanner (System.in);
        z = inputValue.nextInt();

        if (x >= y && x >= z){
            System.out.println("The biggest number is: " +x);}
        if (y >= x && y >= z){
            System.out.println("The biggest numeber is: " +y);
        }else {
            System.out.println("the biggest number is: " +z);
        }

    }
}


