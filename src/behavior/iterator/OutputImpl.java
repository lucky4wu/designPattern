package behavior.iterator;

import java.util.List;

public class OutputImpl {

    private List<College> collegeList;

    public OutputImpl(List<College> collegeList){
        this.collegeList = collegeList;
    }

    public void printCollege(){
        java.util.Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("======"+college.getName()+"=====");
            printDepartment(college.createIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
