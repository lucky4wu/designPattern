package structural.bridge;

public class Client {

    public static void main(String[] args) {
        Phone phone = new FoldedPhone(new Vivo());

        phone.open();
        phone.call();
        phone.close();

        Phone phone1 = new UpRightPhone(new Xiaomi());

        phone1.open();
        phone1.call();
        phone1.close();
    }
}
