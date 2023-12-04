import java.lang.Math;
import java.util.Scanner;
public class UCLNBCNN {
    public static int UCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int BCNN(int a, int b) {
        return Math.abs(a * b) / UCLN(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Nhap so 2: ");
        int num2 = scanner.nextInt();
        int UCLN = UCLN(num1, num2);
        System.out.println("UCLN của " + num1 + " và " + num2 + " là " + UCLN);
        int BCNN = BCNN(num1, num2);
        System.out.println("BCNN của " + num1 + " và " + num2 + " là " + BCNN);
    }
}
