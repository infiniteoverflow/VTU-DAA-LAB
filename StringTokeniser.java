package com.programs;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringTokeniser {

    String name;

    public void readCustomer() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the details in the format <name,dd/mm/yyyy");
        name = in.nextLine();
        if(!name.startsWith("<") && !name.endsWith(">")) {
            System.out.println("Enter the name in the correct format");
            return;
        }
    }

    public void displayCustomer() {
        StringTokenizer token = new StringTokenizer(name,"<,/>");
        String finalString = null;
        while(token.hasMoreTokens()) {
            if(finalString==null) {
                finalString = token.nextToken();
            }
            else
                finalString = finalString + " "+token.nextToken();
        }

        System.out.println("The final String is :"+finalString);
    }

    public static void main(String[] args) {
        StringTokeniser st = new StringTokeniser();
        st.readCustomer();
        st.displayCustomer();
    }
}
