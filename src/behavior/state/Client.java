package behavior.state;

public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity(1);

        for (int i=0;i<10;i++){
            System.out.println("----------第"+ (i +1)+"次抽奖-------");
            activity.deduceMoney();
            activity.raffle();
            if (activity.getCount() <= 0 ){
                break;
            }
        }
    }
}
