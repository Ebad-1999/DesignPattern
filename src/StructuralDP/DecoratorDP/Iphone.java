package StructuralDP.DecoratorDP;

public class Iphone implements phone{


    @Override
    public String getName() {
        return "Iphone";
    }

    @Override
    public int cameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 559.9;
    }
}
