import java.util.Scanner;
public class interger {
    public static int sum(int num) {
        int sum=0;
        while (num>0) {
            int unit=num%10;
            num=num/10;
            sum=sum+unit;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a interger number");
        int num=scanner.nextInt();
        System.out.println("Sum of the digits of the number just entered: "+sum(num));
    }
}
