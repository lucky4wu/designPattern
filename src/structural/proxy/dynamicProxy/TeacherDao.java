package structural.proxy.dynamicProxy;

public class TeacherDao implements ITeacherDao {


    @Override
    public void teach() {
        System.out.println("开始教授。。。。");
    }
}
