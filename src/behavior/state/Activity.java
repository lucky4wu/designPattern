package behavior.state;

public class Activity {

    private State state;
    private CanRaffleState canRaffleState;
    private NoRaffleState noRaffleState;
    private DispenseState dispenseState;
    private DispenseOutState dispenseOutState;
    private int count;

    public Activity(int count) {
        canRaffleState = new CanRaffleState(this);
        noRaffleState = new NoRaffleState(this);
        dispenseState = new DispenseState(this);
        dispenseOutState = new DispenseOutState(this);
        this.setState(noRaffleState);
        this.count = count;
    }

    public void deduceMoney(){
        System.out.println("扣除50积分");
        this.setState(canRaffleState);
    }
    public void raffle(){
        if (state.raffle()){
            state.dispensePrize();
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public CanRaffleState getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(CanRaffleState canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public NoRaffleState getNoRaffleState() {
        return noRaffleState;
    }

    public void setNoRaffleState(NoRaffleState noRaffleState) {
        this.noRaffleState = noRaffleState;
    }

    public DispenseState getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(DispenseState dispenseState) {
        this.dispenseState = dispenseState;
    }

    public DispenseOutState getDispenseOutState() {
        return dispenseOutState;
    }

    public void setDispenseOutState(DispenseOutState dispenseOutState) {
        this.dispenseOutState = dispenseOutState;
    }

}
