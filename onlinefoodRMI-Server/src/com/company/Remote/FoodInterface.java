package com.company.Remote;

import java.rmi.Remote;

public interface FoodInterface extends Remote {

    void Food(String food) throws Exception;
    void payment(String cost) throws Exception;
}
