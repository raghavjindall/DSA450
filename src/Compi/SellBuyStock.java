package Compi;

import java.util.Scanner;

public class SellBuyStock {
    public static int BestTime(int[] arr, int n) {
        int min = arr[0], j = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < min) {
                min = arr[i];
                j = i;
            }
        }
        int max=arr[j];
        for(int i=j;i<n;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max-min);
        return max-min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] a =new int[n];
        for ( i=0;i<n ;i++)
            a[i]=sc.nextInt();
        System.out.println(BestTime(a,n));

    }
}
