package BehavioralDP.chainOfResposibilityDp;

public class ChainOfResponsibilityRunner {

    public static void main(String[] args) {

        ChainOfResponsibilityRunner responsibilityRunner = new ChainOfResponsibilityRunner();
        responsibilityRunner.chainOfResponsibility();
    }


    void chainOfResponsibility(){

        Approver generalManager = new GeneralManager();

        Approver manager = new Manager(generalManager);

        Approver official = new Official(manager);

        System.out.println("Limit for Loan: ");
        System.out.println("For official max limit is : < 100");
        System.out.println("For manager max limit is : < 500");
        System.out.println("For  general manager is no limit ");

        System.out.println("request amount is : 50 ");
        official.approveLoan(110);

        System.out.println("request amount is : 450 ");
        official.approveLoan(450);
        System.out.println("request amount is : 1050 ");
        official.approveLoan(1050);



    }
}
