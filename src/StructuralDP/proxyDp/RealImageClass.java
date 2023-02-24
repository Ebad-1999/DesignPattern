package StructuralDP.proxyDp;

public class RealImageClass  implements ImageGenerator {


    private String name;
    private RealImageClass realImageClass;

    private String fullPath;

    public RealImageClass(String fullPath) {
        this.fullPath = fullPath;
    }


    @Override
    public void showImageName() {
        System.out.println("Image name Displayed..." + fullPath);

    }

    public void loadImage() {
        // method load image
    }

    public void changeImage() {
        // change Image
    }
}