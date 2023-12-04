import java.util.Scanner;
public class primeNumber {
    public static boolean checkPrime(int num) {
        boolean check = true;
        if (num==1) return false;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                check = false;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        System.out.println("Input a number N: ");
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        long sum=0;
        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
                sum=sum+i;
            }
        }
        System.out.println("Tong cac so nguyen to tu 1 den n: "+sum);
    }
}
