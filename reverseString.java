import java.util.Scanner;
public class reverseString {
    public static String reverse(String str) {
        char[] charArr = str.toCharArray();
        int i = 0;
        int j = charArr.length - 1;
        while (i < j) {
            char temp = charArr[i];
            charArr[i] = charArr[j];
            charArr[j] = temp;
            i++;
            j--;
        }
        return new String(charArr);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str=scanner.nextLine();
        System.out.println("Chuoi da dao nguoc: "+reverse(str));
    }
}
