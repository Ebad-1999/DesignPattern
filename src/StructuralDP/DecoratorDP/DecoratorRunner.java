package StructuralDP.DecoratorDP;

public class DecoratorRunner {
    public static void main(String[] args) {

        DecoratorRunner decoratorRunner = new DecoratorRunner();
        decoratorRunner.showIphone11Pro();

    }

    public void showIphone11Pro(){
        phone iphone11Pro = new Iphone11Pro(new Iphone());

        System.out.println("Name :"+iphone11Pro.getName());
        System.out.println("Number of Camera :"+iphone11Pro.cameraCount());
        System.out.println("Price :"+iphone11Pro.getPrice());

        System.out.println("-------------------");

        phone iphone11ProMax = new Iphone11ProMax(new Iphone());

        System.out.println("Name :"+iphone11ProMax.getName());
        System.out.println("Number of Camera :"+iphone11ProMax.cameraCount());
        System.out.println("Price :"+iphone11ProMax.getPrice());
    }
}
