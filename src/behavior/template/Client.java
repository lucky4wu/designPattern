package behavior.template;

import behavior.template.improve.PureSoyMilk;

public class Client {

    public static void main(String[] args) {
        SoyMilk soyMilk = new BlackBeanSoyMilk();
        soyMilk.make();

        SoyMilk soyMilk1 = new PeanutSoyMilk();
        soyMilk1.make();

    }
}
