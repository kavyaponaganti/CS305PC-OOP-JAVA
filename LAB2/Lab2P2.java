import java.util.Scanner;
class LAB2P2 {
    public static void main(String...args){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = x;
        System.out.println("Output is: " + x + + + + + x); // Note: x+++++x is likely a typo, interpreted as x++ + ++x
        x = y;
        System.out.println("O/p is: " + (x++ + ++x));
        x = y;
        System.out.println("O/p is: " + x + + + + + x + " : o/p is"); // Note: x+++++x is likely a typo, interpreted as x++ + ++x
    }
}