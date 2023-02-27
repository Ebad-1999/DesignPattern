package BehavioralDP.chainOfResposibilityDp;

public class GeneralManager extends Approver{
    public GeneralManager() {
        super(null);
    }

    @Override
    boolean approveLoan(int mount) {
        System.out.println("General Manager approve ");
        System.out.println("________________________");
        return true;
    }
}
