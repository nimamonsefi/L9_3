package com.company;

import com.company.Remote.FoodInterface;

import java.rmi.server.UnicastRemoteObject;

public class FoodImplementor extends UnicastRemoteObject implements FoodInterface {

    public FoodImplementor() throws Exception{}

    @Override
    public void Food(String food) throws Exception {
        System.out.println("\tFood is Making!");
    }

    @Override
    public void payment(String cost) throws Exception {
        System.out.println("\tCost Payed successfully!");
    }
}
