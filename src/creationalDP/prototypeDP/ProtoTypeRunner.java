package creationalDP.prototypeDP;

public class ProtoTypeRunner {

    public static void main(String[] args) {


        // bad scenario  -- Hard code
        Soldier availableForWar= new Soldier(100,45,20,30,
                10,30,"Award",true);

        Soldier NotAvailableForWar= new Soldier(100,45,20,30,
                10,30,"Award",false);


        Soldier NotAvailableForWar2= new Soldier(100,45,20,30,
                10,30,"Award",false);
        availableForWar.showSoldierInfo();

        System.out.println("------------------------");
        NotAvailableForWar.showSoldierInfo();


        /// Good scenario

        Soldier  availableForWar1 =NotAvailableForWar2.clone();
        NotAvailableForWar2.setAvailableForWar(false);

        System.out.println("-----------------------");
        NotAvailableForWar2.showSoldierInfo();



    }
}