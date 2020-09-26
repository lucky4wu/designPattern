package structural.bridge;

public class Vivo implements Brand{
    @Override
    public void open() {
        System.out.println("打开Vivo手机");
    }

    @Override
    public void call() {
        System.out.println("用Vivo手机打电话");
    }

    @Override
    public void close() {
        System.out.println("关闭Vivo手机");
    }
}
