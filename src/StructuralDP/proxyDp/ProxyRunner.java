package StructuralDP.proxyDp;

public class ProxyRunner {

    public static void main(String[] args) {


        ShowImagePath();

    }

    public static void ShowImagePath(){

        ImageGenerator proxyImage1= new ImageProxyClass("c://imagefolder/image1.png");
        ImageGenerator proxyImage2= new ImageProxyClass("c://imagefolder/image2.png");
        proxyImage1.showImageName();
        proxyImage2.showImageName();
    }
}
