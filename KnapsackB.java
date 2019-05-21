package com.programs;
import java.util.*;

public class KnapsackB {
    public static void knapsack(int n,int item[],float weight[],float profit[],float capacity) {
        float tp=0,u;
        int i;
        u = capacity;
        float x[] = new float[20];
        for(i=0;i<n;i++)
            x[i] = (float)0.0;
        for(i=0;i<n;i++) {
            if(weight[i]>u)
                break;
            else {
                x[i] = (float) 1.0;
                tp+=profit[i];
                u = (int)(u-weight[i]);
            }
        }

        if(i<n)
            x[i] = u/weight[i];
        tp = tp+(x[i]*profit[i]);
        System.out.println("The result vector is:");
        for(i=0;i<n;i++)
            System.out.println("Item "+item[i]+":"+x[i]);
        System.out.println("Maximum profit: "+tp);
    }

    public static void main(String[] args) {
        float weight[] = new float[20],profit[] = new float[20],capacity;
        int num,i,j;
        float ratio[] = new float[20],temp;
        int item[] = new int[10];

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no. of items:");
        num = in.nextInt();
        System.out.println("Enter the items,weights and profits of each object");
        for(i=0;i<num;i++) {
            item[i] = in.nextInt();
            weight[i] = in.nextFloat();
            profit[i] = in.nextFloat();
        }
        System.out.println("Enter the capacity of knapsack:");
        capacity = in.nextFloat();
        for(i=0;i<num;i++) {
            ratio[i] = profit[i]/weight[i];
        }
        for(i=0;i<num;i++)
            for(j=i+1;j<num;j++)
                if(ratio[i]<ratio[j]) {

                    temp = ratio[j];
                    ratio[j] = ratio[i];
                    ratio[i] = temp;

                    temp = weight[j];
                    weight[j] = weight[i];
                    weight[i] = temp;

                    temp = profit[j];
                    profit[j] = profit[i];
                    profit[i] = temp;

                    temp = item[j];
                    item[j] = item[i];
                    item[i] = (int)temp;
                }

                knapsack(num,item,weight,profit,capacity);
    }

}
