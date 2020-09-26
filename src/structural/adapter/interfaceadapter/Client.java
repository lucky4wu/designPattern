package structural.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void m1() {
                System.out.println("使用m1方法");
            }
        };
        abstractAdapter.m1();
    }
}
