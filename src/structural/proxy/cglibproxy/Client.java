package structural.proxy.cglibproxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory(new TeacherDao());
        TeacherDao proxy = (TeacherDao) factory.getProxyInstance();
        proxy.teach();
    }
}
