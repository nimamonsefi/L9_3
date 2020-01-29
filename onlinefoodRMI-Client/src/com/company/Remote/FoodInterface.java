package com.company.Remote;

import java.rmi.Remote;

public interface FoodInterface extends Remote {

    void Food(String amd) throws Exception;
    void payment(String cost) throws Exception;
}
