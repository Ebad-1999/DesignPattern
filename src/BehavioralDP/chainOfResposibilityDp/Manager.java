package BehavioralDP.chainOfResposibilityDp;

public class Manager extends Approver{

    public Manager(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int mount) {

        if (mount<500){
            System.out.println("Bank manager approved ");
            System.out.println("_______________________");
        } else if (chief!=null) {
            System.out.println("Amount exceed the limit that manager can approve . your are direct to general  manager ");
            return chief.approveLoan(mount);
        }
        return false;

    }
}
