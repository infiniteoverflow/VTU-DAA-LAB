package com.programs;

import java.util.Scanner;

public class Student {
    String usn,name,branch;
    long phone;

    void getDetail() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the student USN:");
        usn = in.nextLine();
        System.out.println("Enter the student name:");
        name = in.nextLine();
        System.out.println("Enter the student branch:");
        branch = in.nextLine();
        System.out.println("Enter the student phone:");
        phone = in.nextLong();
    }

    void putDetails() {
        System.out.println("USN: "+usn+"\nName: "+name+"\nBranch: "+branch+"\nPhone: "+"\n");
    }

    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the number of students:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Student a[] = new Student[n];
        for(i=0;i<n;i++)
            a[i] = new Student();
        for(i=0;i<n;i++) {
            System.out.println("Enter the details of Student "+(i+1));
            a[i].getDetail();
        }

        for(i=0;i<n;i++) {
            System.out.println("The details of Student "+(i+1));
            a[i].putDetails();
        }
    }
}
