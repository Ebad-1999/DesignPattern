package StructuralDP.DecoratorDP;

public class Iphone11ProMax extends Iphone11Pro{
    public Iphone11ProMax(Iphone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"11 Pro Max";
    }


    @Override
    public double getPrice() {
        return super.getPrice()+200;//959
    }
}
