package behavior.iterator;

public class ComputerCollegeIterator implements Iterator{
    private Department[] departments;
    int position = 0;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if (position >= departments.length || null == departments[position]){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position+=1;
        return department;
    }
}
