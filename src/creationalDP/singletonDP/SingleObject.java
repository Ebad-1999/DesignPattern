package creationalDP.singletonDP;

public class SingleObject {

    String message = "HELLO";

    //it creates instance object
    private static SingleObject instance  = new SingleObject();

    //this constructor cannot be accessed from other clasess
    private SingleObject() {

    }

    //allows us object created only once
    public static SingleObject getInstance(){
        return instance;
    }

    public void changeMessage(){
        this.message = this.message+" Batch 110-111";
    }

}
