package com.programs;

import java.util.Scanner;

public class Dijkstra {

    static int d[] = new int[10],
        s[] = new int[20],
        i,n,min=0,j,k,
        p[] = new int[20],
        w[][] = new int[20][20];

    public static int findmin() {
        for(i=1;i<=n;i++) {
            if(s[i] == 0) {
                min = 1;
                break;
            }
        }
        for(i=1;i<=n;i++) {
            if(d[i]<d[min] && s[i]==0) {
                min = i;
            }
        }
        return min;
    }

    public static void djistra(int v,int w[][],int s[],int d[],int n) {
        for(i=1;i<=n;i++) {
            s[i] = 0;
            d[i] = 999;
            p[i] = 0;
        }

        d[v] = 0;
        for(k=1;k<=n;k++) {
            int u = findmin();
            s[u] = 1;
            for(int w1=1;w1<=n;w1++) {
                if(w[u][w1]!=999 && s[w1]==0) {
                    if(d[w1]>d[u]+w[u][w1]) {
                        d[w1] = d[u]+w[u][w1];
                        p[w1] = u;
                    }
                }
            }
        }
        System.out.println("Shortest Path:");
        for(i=1;i<=n;i++) {
            if(d[i]==999)
                System.out.println("The distance from "+v+" to "+i+" is 0");
            else
                System.out.println("The distance from "+v+" to "+i+" is "+d[i]);
        }

        System.out.println("Shortest Groups of paths are:");
        for(i=1;i<=n;i++) {
            if(i!=v && d[i]!=999) {
                System.out.println(i);
                j = p[i];
                while(p[j]!=0) {
                    System.out.println("<---"+j);
                    j = p[j];
                }
                System.out.println("<---"+v);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of vertices:");
        n = in.nextInt();
        System.out.println("Enter the cost matrix:");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++)
                w[i][j] = in.nextInt();
        System.out.println("Enter the source matrix:");
        int v = in.nextInt();
        djistra(v,w,s,d,n);
    }
}
