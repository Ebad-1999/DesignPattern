package StructuralDP.FacedeDP;

public class CustomEncryptor {
    public static void main(String[] args) {

        String text = "Content";

        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text, "security key");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text, "security key", true);

        System.out.println("---------------------");

        FacadeEncryptor facadeEncryptor= new FacadeEncryptor();
        facadeEncryptor.encrypt(text, FacadeEncryptor.EncryptType.MD5);
        facadeEncryptor.encrypt(text, FacadeEncryptor.EncryptType.SHA);
        facadeEncryptor.encrypt(text, FacadeEncryptor.EncryptType.AES);
    }
}
