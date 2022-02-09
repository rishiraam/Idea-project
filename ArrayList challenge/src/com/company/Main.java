package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Xbox mybox=new Xbox("MYbox");
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter no of games to add");
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter game name");
            String name=sc.nextLine();
            System.out.println("Enter price");
            int price=sc.nextInt();
            mybox.add(name,price);
            sc.nextLine();
        }
        System.out.println("Games present are:");
        mybox.print();

    }
}
