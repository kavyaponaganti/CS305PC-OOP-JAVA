import java.util.Scanner;

class Lab2P4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a value");
        int a = s.nextInt();
        System.out.println("Enter b value");
        int b = s.nextInt();
        System.out.println("Bitwise AND: " + (a & b));
        s.close();
    }

}
