package BehavioralDP.MediatorDP;

public class MediatorRunner {

    public static void main(String[] args) {

        MediatorRunner mediatorRunner = new MediatorRunner();
        mediatorRunner.mediatorInfo();

    }
    void mediatorInfo(){

        // dispatcher object

        MessageDispatcher dispatcher= new MessageDispatcher();

        // create 4 teacher /expert

        Teacher chemistryTeacher = new MessageTeacher("chemistryTeacher ",dispatcher);
        Teacher mathTeacher = new MessageTeacher("MathematicsTeacher ",dispatcher);
        Teacher physicsTeacher = new MessageTeacher("physicsTeacher ",dispatcher);
        Teacher biologyTeacher = new MessageTeacher("biologyTeacher ",dispatcher);

        //  register teacher to dispatcher

        dispatcher.register("chemistry",chemistryTeacher);
        dispatcher.register("mathematics",mathTeacher);
        dispatcher.register("physics",physicsTeacher);
        dispatcher.register("biology",biologyTeacher);

        // one teacher can ask a question form

        chemistryTeacher.sendMessage("mathematics","i have a question about math");
        chemistryTeacher.sendMessage("physics","i have a question about physics");
        chemistryTeacher.sendMessage("biology","i have a question about biology");


    }


}
