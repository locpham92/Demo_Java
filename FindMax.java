import java.util.Scanner;
public class FindMax {
    public static int Max(int[] array) {
        int max=array[0];
        for (int i=1; i<array.length; i++) {
            if (max<array[i]) {
                max=array[i];
            }
        }
        return max;
    }
    public static void checkInc(int[] array) {
        boolean check=true;
        for (int i=0; i<array.length-1; i++) {
            if (array[i]>=array[i+1]) {
                check=false;
            }
        }
        if (check) {
            System.out.println("Mang tang dan");
        }
        else {
            System.out.println("Mang khong phai tang dan");
        }
    }
    public static void reverse(int[] array) {
        int i=0;
        int j=array.length-1;
        while (i<=j) {
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }
    public static void sort(int[] array) {
        for (int i=0; i<array.length-1; i++) {
            for (int j=i+1; j<array.length; j++) {
                if (array[i]>array[j]) {
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
    }
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
        int[] arr={1,2,3,4,5,6,8,7,8};
        System.out.println("Mang ban dau:");
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("Max= "+Max(arr));
        checkInc(arr);
        System.out.println("Mang dao chieu:");
        reverse(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println();
        System.out.println("Mang sap xep tang dan:");
        sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+",");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhap so k: ");
        int k =scanner.nextInt();
        int max=arr[arr.length-1];
        int count=1;
        for (int i=arr.length-2; i>=0; i--) {
            if (arr[i]<max) {
                if (count==k) break;
                count++;
                max=arr[i];
            }
        }
        System.out.println("So lon thu k: "+max);
        System.out.println("Cac so nguyen to trong mang:");
        for (int i=0;i<arr.length;i++) {
            if (checkPrime(arr[i])) {
                System.out.print(arr[i]+",");
            }
        }
    }
}
