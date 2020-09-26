package behavior.mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {
    private Map<String, Colleague> colleagueMap;
    private Map<String, String> interMap;

    public ConcreteMediator(){
        colleagueMap = new HashMap<String, Colleague>();
        interMap = new HashMap<String, String>();
    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);

        if (colleague instanceof Alarm){
            interMap.put("Alarm", name);
        }else if (colleague instanceof CoffeeMachine){
            interMap.put("CoffeeMachine", name);
        }else if (colleague instanceof TV){
            interMap.put("TV", name);
        }else if (colleague instanceof Curtains){
            interMap.put("Curtains", name);
        }
    }

    @Override
    public void getMessage(int stateChange, String colleagueName) {
        if (colleagueMap.get(colleagueName) instanceof Alarm){
            if (stateChange == 0){
                ((CoffeeMachine)colleagueMap.get(interMap.get("CoffeeMachine"))).start();
                ((TV)colleagueMap.get(interMap.get("TV"))).start();
            } else if(stateChange == 1){
                ((TV)colleagueMap.get(interMap.get("TV"))).stop();
            }
        }else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine){
            ((Curtains)colleagueMap.get(interMap.get("Curtains"))).up();
        }else if (colleagueMap.get(colleagueName) instanceof TV){

        }else if (colleagueMap.get(colleagueName) instanceof Curtains){

        }
    }

    @Override
    public void sendMessage() {

    }
}
