package behavior.state;

import java.util.Random;

public class CanRaffleState implements State{
    private Activity activity;

    public CanRaffleState(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void deduceMoney() {
        System.out.println("已经扣取过了积分");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        Random r = new Random();
        int num = r.nextInt(3);
        if (num == 0){
            activity.setState(activity.getDispenseState());
            return true;
        } else {
            System.out.println("很遗憾没有抽中奖品！");
            activity.setState(activity.getNoRaffleState());
            return false;
        }
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }
}
