package BehavioralDP.MediatorDP;

public class MessageTeacher implements Teacher{

    String name;

    // create variable dispatcher

    Dispatcher dispatcher;


    //constructor
    public MessageTeacher(String name, Dispatcher dispatcher) {
        this.name = name;
        this.dispatcher = dispatcher;
    }


    @Override
    public void receiveMessage(String message) {

        System.out.println(name + " receive message " +message);
    }

    @Override
    public void sendMessage(String topic, String message) {

        dispatcher.dispatch(topic,message);
    }


}
