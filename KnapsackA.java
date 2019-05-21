package com.programs;

import java.util.Scanner;

public class KnapsackA {

    private static int w[] = new int[10],b[] = new int[10],v[][] = new int[10][10] ,value[] = new int[10];

    public static int max(int a,int b) {
        return (a>b)?a:b;
    }

    public static int knap(int i,int j) {
        if(i==0||j==0)
            v[i][j] = 0;
        else if(j<w[i])
            v[i][j] = knap(i-1,j);
        else
            v[i][j] = max(knap(i-1,j),value[i]+knap(i-1,j-w[i]));
        return v[i][j];
    }

    public static void optimal(int i,int j) {
        if(i>=1 || j>=1) {
            if(v[i][j]!=v[i-1][j]) {
                System.out.println("Item : "+i);
                b[i] = 1;
                j = j-w[i];
                optimal(i-1,j);
            }
            else
                optimal(i-1,j);
        }
    }

    public static void main(String[] args) {
        int profit,w1,n,i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of items:");
        n = in.nextInt();
        System.out.println("Enter the capacity of the knapsack:");
        w1 = in.nextInt();
        System.out.println("Enter the values:");
        for(i=1;i<=n;i++)
            value[i] = in.nextInt();
        System.out.println("Enter the weights:");
        for(i=1;i<=n;i++)
            w[i] = in.nextInt();
        profit = knap(n,w1);
        System.out.println("Profit: "+profit);
        System.out.println("Optimal Solution:");
        optimal(n,w1);
        System.out.println("The solution vector is: ");
        for(i=1;i<=n;i++)
            System.out.println(b[i]);
    }
}
