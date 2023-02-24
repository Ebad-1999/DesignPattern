package StructuralDP.compositeDP;

import java.util.Arrays;

public class CompositeRunner {

    public static void main(String[] args) {

        //CompositeRunner compositeRunner = new CompositeRunner();
        CompositeRunner.compositeDemo();

    }

    public static void compositeDemo(){
        Department financeDepartment = new Finance();
        Department salesDepartment = new Sales();
        Department researchDepartment = new RDepartment();

        Department hrDepartment = new HRDepartment(Arrays.asList(financeDepartment, salesDepartment, researchDepartment));

        System.out.println(hrDepartment.getName());
        System.out.println("*---------------*");
        System.out.println(hrDepartment.getEmployee());

    }
}
