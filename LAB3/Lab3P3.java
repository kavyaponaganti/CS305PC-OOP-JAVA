import java.util.Scanner;

class Lab3P3{
    public static void main(String...args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 2;
        do {
            int j = 0;
            int count = 0;
            do {
                if (i == 2) {
                    count++;
                    j++;
                    continue;
                }
                if (i % j == 0) {
                    count = 0;
                    break;
                }
                else {
                    count++;
                    j++;
                }
            } while (j < i);
            System.out.println(i);
            i++;
        } while (i < n);
    }
}