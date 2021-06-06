package base;
import java.text.DecimalFormat;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.00");

        //Input
        System.out.print("Enter the principal: ");
        int principal = newScan.nextInt();

        System.out.print("Enter the rate of interest: ");
        double rate = newScan.nextDouble();

        System.out.print("Enter the number of years: ");
        int years = newScan.nextInt();

        System.out.print("Enter the number of times the interest is compounded per year? ");
        int numCompound = newScan.nextInt();

        //Calculations
        double money = Math.pow((principal*(1+((rate/100)/numCompound))), (numCompound*years));

        //Output
        System.out.println((principal*(1+((rate/100)/numCompound))));
        System.out.println((numCompound*years));
        System.out.println("$"+ principal + " invested at " + rate + "% for " + years + " years compounded " + numCompound + " times per year is $" + numFormat.format(money) + ".");

    }
}
