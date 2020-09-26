package behavior.iterator;

import java.util.List;

public class InfoCollegeIterator implements Iterator{
    private List<Department> departmentList;
    private int index = -1;

    public InfoCollegeIterator(List<Department> departmentList) {
        this.departmentList = departmentList;
    }

    @Override
    public boolean hasNext() {
        if (index >= departmentList.size()-1){
            return false;
        }
        index += 1;
        return true;
    }

    @Override
    public Object next() {
        return departmentList.get(index);
    }
}
