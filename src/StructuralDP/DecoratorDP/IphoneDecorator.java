package StructuralDP.DecoratorDP;

public class IphoneDecorator implements phone {

    protected phone basicPhone;

    public IphoneDecorator(Iphone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName(); //Iphone  +11
    }

    @Override
    public int cameraCount() {
        return basicPhone.cameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}
