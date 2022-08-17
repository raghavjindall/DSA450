package Compi;

import java.util.Scanner;
import java.util.*;
public class MinimumDiffrence {
    public static void Minimum(int []arr , int n , int k){
        int max,min,i,res;
        Arrays.sort(arr);
        res=arr[n-1]-arr[0];
        for (i=1;i<n;i++) {
            if(arr[i]>=k)
            {
                max=Math.max(arr[i-1] + k , arr[n-1] - k);
                min=Math.min(arr[i]-k, arr[0]+k);
                res=Math.min(max-min,res);
            }
        }
        System.out.println(res);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,k;
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int[] a =new int[n];
        System.out.println("Enter the value of k");
        k=sc.nextInt();
        for ( i=0;i<n ;i++)
            a[i]=sc.nextInt();
        Minimum(a,n,k);
    }
}
