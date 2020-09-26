package behavior.state;

public class DispenseState implements State{
    private Activity activity;

    public DispenseState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("不能扣除积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("不能抽奖积分");
        return false;
    }

    @Override
    public void dispensePrize() {
        if (activity.getCount() > 0){
            System.out.println("恭喜中奖了");
            int curCount = activity.getCount();
            activity.setCount(curCount--);
            activity.setState(activity.getNoRaffleState());
        }else {
            System.out.println("很遗憾，奖品送完了");
            activity.setState(activity.getDispenseOutState());
        }
    }
}
