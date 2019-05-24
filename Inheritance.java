package com.programs;


import java.util.Scanner;

class Staff {
    int staffId;
    String sname;
    long phone;
    float salary;

    void getSDetails() {
        Scanner in  = new Scanner(System.in);
        System.out.println("Enter the staff ID:");
        staffId = in.nextInt();
        System.out.println("Enter the staff name:");
        sname = in.nextLine();
        System.out.println("Enter the staff phone no.:");
        phone = in.nextLong();
        System.out.println("Enter the staff salary:");
        salary = in.nextFloat();
    }

    void putSDetails() {
        System.out.println("Staff ID: "+staffId+"\nStaff name: "+sname+"\nStaff Phone number: "+phone+"\nSalary: "+salary);
        System.out.println();
    }
}

class Teaching extends Staff {
    String domain,publication;

    void getTDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the domain:");
        domain = in.nextLine();
        System.out.println("Enter the Publication:");
        publication = in.nextLine();
    }

    void putTDetails() {
        System.out.println("Domain: "+domain+"\nPublication: "+publication);
        System.out.println();
    }
}

class Technical extends Staff {
    String skills;
    void getT1Details() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the skills:");
        skills = in.nextLine();
    }

    void putT1Details() {
        System.out.println("Skills: "+skills);
        System.out.println();
    }
}

class Contract extends Staff {
    String period;
    void getCDetails() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the period:");
        period = in.nextLine();
    }

    void putCDetails() {
        System.out.println("Period: "+period);
        System.out.println();
    }
}
public class Inheritance {
    public static void main(String[] args) {
        int i,n;
        System.out.println("Enter the number of staff:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Staff s[] = new Staff[n];
        Teaching t[] = new Teaching[n];
        Technical t1[] = new Technical[n];
        Contract c[] = new Contract[n];

        for(i=0;i<n;i++) {
            s[i] = new Staff();
            t[i] = new Teaching();
            t1[i] = new Technical();
            c[i] = new Contract();
        }

        for(i=0;i<n;i++) {
            System.out.println("Enter the details of staff :"+(i+1));
            s[i].getSDetails();
            t[i].getTDetails();
            t1[i].getT1Details();
            c[i].getCDetails();
        }

        System.out.println("----------------------");

        for(i=0;i<n;i++) {
            System.out.println("The details of staff :"+(i+1));
            s[i].putSDetails();
            t[i].putTDetails();
            t1[i].putT1Details();
            c[i].putCDetails();
            System.out.println("-----------");
        }
    }
}
