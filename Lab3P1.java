Import java.util.Scanner;

ClassLab3P1{
public static void main(String...args) {
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
            int i = 2;
            while (i<n){
            int j = 0;
            int count = 0;
            while (j <= i) {
                if (i == 2) {
                    count++;
                    break;
                }
                if (i % j == 0){
                    break;
                } else {
                    count++;
                }
                j++;
            }
            if (count > 0) {
                System.out.println(i);
	i++;     
        }
    }
}
