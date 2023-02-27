package BehavioralDP.chainOfResposibilityDp;

public class Official extends Approver{

    public Official(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int mount) {

        if (mount<100){
            System.out.println("Bank officer approved ");
            System.out.println("_______________________");
        } else if (chief!=null) {
            System.out.println("Amount exceed the limit that officer can approve . your are direct to manager ");
            return chief.approveLoan(mount);
        }
        return false;
    }
}
