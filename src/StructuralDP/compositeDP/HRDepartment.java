package StructuralDP.compositeDP;

import java.util.List;
import java.util.stream.Collectors;

public class HRDepartment extends Department{

    List<Department> childDepartment;

    public HRDepartment(List<Department> childDepartment) {
        this.childDepartment = childDepartment;
    }

    @Override
    String getName() {
        return childDepartment.
                stream().map(Department::getName).
                collect(Collectors.joining("-")); //Finance - sales
    }

    @Override
    List<String> getEmployee() {
        return childDepartment.stream().
                flatMap(d->d.getEmployee().stream()).
                collect(Collectors.toList());
    }
}
