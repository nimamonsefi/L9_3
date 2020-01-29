package com.company;

import com.company.Remote.FoodInterface;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String cost, accept, food;
        try {
            FoodInterface foodInterface = (FoodInterface) Naming.lookup("//localhost/onlinefood");
            System.out.println("\t- Welcome to OnlineFood order -");
            while (true) {
                System.out.println("Write your favourite Foods");
                food = input.next();
                System.out.println("DO YOU ACCEPT?(y/n)");
                accept = input.next();
                if (accept.equals("y")) {
                    break;
                }
            }
            System.out.println("\tFoods are record successfully.");
            foodInterface.Food(food);
            System.out.println("Your cost is 1,345,000 Rial");
            while (true) {
                System.out.println("*Please write cost to pay");
                cost = input.next();
                System.out.println("DO YOU ACCEPT?(y/n)");
                accept = input.next();
                if (accept.equals("y")) {
                    break;
                } else {
                    System.out.println("\t*Check your cost*");
                }
                System.out.println("\tCost payed successfully.");
                foodInterface.payment(cost);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
