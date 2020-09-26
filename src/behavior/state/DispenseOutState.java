package behavior.state;

public class DispenseOutState implements State{
    private Activity activity;

    public DispenseOutState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("奖品发送完了，请下次参加");
    }

    @Override
    public boolean raffle() {
        System.out.println("奖品发送完了，请下次参加");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("奖品发送完了，请下次参加");
    }
}
