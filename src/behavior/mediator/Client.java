package behavior.mediator;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Alarm alarm = new Alarm(mediator, "Alarm");
        CoffeeMachine coffeeMachine = new CoffeeMachine(mediator, "CoffeeMachine");
        Curtains curtains = new Curtains(mediator, "Curtains");
        TV tv = new TV(mediator, "TV");

        mediator.register(alarm.getName(), alarm);
        mediator.register(coffeeMachine.getName(), coffeeMachine);
        mediator.register(curtains.getName(), curtains);
        mediator.register(tv.getName(), tv);

        alarm.sendAlarm(0);

        alarm.sendAlarm(1);
        coffeeMachine.finishCoffee();
    }
}
