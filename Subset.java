package com.programs;

import java.util.Scanner;

public class Subset {

    static int d,count=0,x[] = new int[10],w[] = new int[20];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n,sum=0;
        System.out.println("Enter the no. of elements:");
        n = in.nextInt();
        System.out.println("Enter the elements in ascending order:");
        for(i=0;i<n;i++)
            w[i] = in.nextInt();
        System.out.println("Enter the required sum:");
        d = in.nextInt();
        for(i=0;i<n;i++)
            sum+=w[i];
        if(sum<d) {
            System.out.println("Cannot find a solution");
            return;
        }
        subset(0,0,sum);

    }

    public static void subset(int cs,int k,int r) {
        int i;
        x[k] = 1;
        if(cs+w[k] == d) {
            System.out.println("Subset :"+(++count));
            for(i=0;i<=k;i++) {
                if(x[i] == 1)
                    System.out.println(w[i]);
            }
        }

        else if(cs+w[k]+w[k+1] <=d)
            subset((cs+w[k]),k+1,r-w[k]);

        if(cs+r-w[k]>=d && cs+w[k]<=d) {
            x[k] = 0;
            subset(cs,k+1,r-w[k]);
        }
    }
}
