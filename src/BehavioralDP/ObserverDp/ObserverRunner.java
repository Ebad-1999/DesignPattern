package BehavioralDP.ObserverDp;

public class ObserverRunner {
    public static void main(String[] args) {

        ObserverRunner observerRunner = new ObserverRunner();
        observerRunner.observeDemo();

    }

    void  observeDemo(){

        // chanel object

        Chanel chanel1 = new NewsChannel();
        Chanel chanel2 = new NewsChannel();
        Chanel chanel3 = new NewsChannel();


        // agency obj
      NewsAgency agency= new NewsAgency();

      // register changes to agency

        agency.addObserver(chanel1);
        agency.addObserver(chanel2);
        agency.addObserver(chanel3);

        // create news

        agency.sendNews("Learn java at Techpro Education ");
        agency.sendNews("Batch 110-111 students are about to complete the bootcamp");

        System.out.println("News From Chanel 1 : " );
        chanel1.printNews();

        System.out.println("News From Chanel 2 : " );
        chanel2.printNews();

        System.out.println("News From Chanel 3 : " );
        chanel3.printNews();



    }
}
