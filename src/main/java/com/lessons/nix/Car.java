package com.lessons.nix;

import java.util.Date;

public class Car {

    public Car() {

    }

    public String name = "Volvo XC70";
    public int tankCapacity = 70;
    public int fuelPerHundredKM = 5;
    public Date inspectionDate = new Date(1612121212121L);
    /*Sun Jan 31 21:26:52 EET 2021*/

    public boolean isCarCanGo(){
        return tankCapacity>0;
    }

    public boolean isCarApproved() {
        return new Date().getTime() - inspectionDate.getTime() <= 63072000000L;
    }

    public double howMuchCarCanDrive(){
        return tankCapacity/fuelPerHundredKM*100;
    }
}
