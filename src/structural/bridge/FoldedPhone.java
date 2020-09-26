package structural.bridge;

public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    protected void open(){
        System.out.println("折叠手机");
        super.open();
    }

    protected void call(){
        System.out.println("折叠手机");
        super.call();
    }

    protected void close(){
        System.out.println("折叠手机");
        super.close();
    }
}
