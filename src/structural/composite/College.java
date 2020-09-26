package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent{

    List<OrganizationComponent> organizationComponentList = new ArrayList<OrganizationComponent>();

    public College(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.println("--------"+getName()+"--------");
        for (OrganizationComponent oc : organizationComponentList){
            oc.print();
        }
    }
}
