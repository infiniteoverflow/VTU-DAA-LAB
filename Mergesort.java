package com.programs;
import java.util.*;

public class Mergesort {

    static int max = 50000;
    public static void mergeSort(int a[],int low,int high) {
        int mid;
        if(low<high) {
            mid = (low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }

    public static void merge(int a[],int low,int mid,int high) {
        int k=low,j=mid+1,i=low;
        int c[] = new int[1000];

        while((i<=mid)&&(j<=high)) {
            if(a[i]<=a[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = a[j];
                j++;
            }
            k++;
        }

        while(i<=mid) {
            c[k] = a[i];
            k++;i++;
        }

        while(j<=high) {
            c[k] = a[j];
            k++;j++;
        }

        for(i=low;i<=high;i++)
            a[i] = c[i];
    }

    public static void main(String args[]) {
        int n,i;
        System.out.println("Enter the size:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        Random rand = new Random();
        int a[] = new int[max];

        for(i=0;i<n;i++)
            a[i] = rand.nextInt(100);
        System.out.println("The random elements are:");
        for(i=0;i<n;i++)
            System.out.println(a[i]);

        try {
            long start_time = System.nanoTime();
            mergeSort(a,0,n-1);
            long end_time = System.nanoTime();

            System.out.println("The sorted array:");
            for(i=0;i<n;i++)
                System.out.println(a[i]);
            System.out.println("Time taken: "+(end_time-start_time)+" nanoseconds");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index max reached");
        }
    }
}
