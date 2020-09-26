package behavior.template;

public abstract class SoyMilk {

    public final void make(){
        select();
        add();
        soak();
        beat();
    }
    private void select(){
        System.out.println("step one: select");
    }
    private  void soak(){
        System.out.println("step three: soak");
    }
    private void beat(){
        System.out.println("step four: beat");
    }
    public abstract void add();
}
