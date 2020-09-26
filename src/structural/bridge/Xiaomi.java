package structural.bridge;

public class Xiaomi implements Brand{
    @Override
    public void open() {
        System.out.println("打开Xiaomi手机");
    }

    @Override
    public void call() {
        System.out.println("用Xiaomi手机打电话");
    }

    @Override
    public void close() {
        System.out.println("关闭Xiaomi手机");
    }
}
