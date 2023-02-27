package BehavioralDP.MediatorDP;

import java.util.HashMap;
import java.util.Map;

public class MessageDispatcher implements Dispatcher{


    Map<String,Teacher> registeredTeacher= new HashMap<>();

    void register(String topic,Teacher teacher){
        registeredTeacher.put(topic,teacher);
    }

    @Override
    public void dispatch(String topic, String message) {
      Teacher teacher =  registeredTeacher.get(topic);
      if (teacher==null){
          System.out.println("No teacher is registered to this topic..");
      }else {
          teacher.receiveMessage(message);
      }
    }
}
