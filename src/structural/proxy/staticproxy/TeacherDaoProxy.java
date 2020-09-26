package structural.proxy.staticproxy;

public class TeacherDaoProxy implements ITeacherDao{

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("使用代理对象...");
        target.teach();
        System.out.println("代理结束，提交");
    }
}
