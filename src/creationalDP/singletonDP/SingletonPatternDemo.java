package creationalDP.singletonDP;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //SingleObject obj1 = new SingleObject();  // we cannot use new keyword

        SingleObject obj2 = SingleObject.getInstance();
        System.out.println(obj2.message); //HELLO
        obj2.changeMessage(); //HELLO Batch 110-111

        //test if it is singleton object or not
        SingleObject obj3 = SingleObject.getInstance();
        System.out.println("Message for obj3: "+obj3.message); //


    }
}
