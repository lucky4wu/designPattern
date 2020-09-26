package structural.proxy.dynamicProxy;


public class Client {
    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();

        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxy = (ITeacherDao) proxyFactory.getProxyInstance();

        proxy.teach();
    }
}
