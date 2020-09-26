package prototype.deepclone2;

import prototype.deepclone.DeepCloneableTarget;
import prototype.deepclone2.DeepPrototype;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPrototype deepPrototype = new DeepPrototype();
        deepPrototype.name = "宋江";
        deepPrototype.deepCloneableTarget = new DeepCloneableTarget("大牛", "大牛的类");

        DeepPrototype deepPrototype1 = (DeepPrototype) deepPrototype.deepClone();

        System.out.println(deepPrototype);
        System.out.println(deepPrototype1);
    }
}
