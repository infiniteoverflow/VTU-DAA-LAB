package com.programs;

import java.util.Scanner;

public class Dijkstra {

    public static int findmin() {
        int i,n,min=0;
        int d[] = new int[20] , s[] = new int[20];
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        for(i=1;i<=n;i++) {
            if(s[i] == 0) {
                min = 1;
                break;
            }
        }
        return 1;
    }
}
