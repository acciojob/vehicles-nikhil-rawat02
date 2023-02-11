package com.driver;

public class Boat implements WaterVehicle{

    @Override
    public String getVehicleName() {
        return "name";
    }

    @Override
    public int getVehicleCapacity() {
        return 0;
    }
}
