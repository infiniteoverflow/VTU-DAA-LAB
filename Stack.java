package com.programs;

import java.util.Scanner;

class StackDemo {

    int top,size,stack[];

    public StackDemo(int arraySize) {
        this.size = arraySize;
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if(top==size-1)
            System.out.println("Stack is full , cant push a value :(");
        else
            stack[++top] = value;
    }

    public int pop() {
        int t=0;
        if(top==-1) {
            System.out.println("Cant pop...stack is empty :(");
            return -1;
        }
        else {
            t = top--;
            return stack[t];
        }
    }

    public void display() {
        for(int i=top;i>=0;i--)
            System.out.println(stack[i]);
        System.out.println();
    }
}

class Stack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Stack operations");
        System.out.println("Enter the size of stack:");
        int n = in.nextInt();
        int choice;

        StackDemo stk = new StackDemo(n);

        do {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("Enter the choice:");
            int ch = in.nextInt();
            switch(ch) {
                case 1:
                    System.out.println("Enter the element to push:");
                    int ele = in.nextInt();
                    stk.push(ele);
                    break;
                case 2:
                    int s = stk.pop();
                    if(s!=-1)
                        System.out.println("Popped Element is: "+s);
                    break;
                case 3:
                    stk.display();
                    break;
            }
            System.out.println("Do u wish to continue:");
            choice = in.nextInt();
        } while(choice==1);
    }
}
