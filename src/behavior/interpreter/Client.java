package behavior.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Client {

    public static void main(String[] args) throws IOException{
        String expStr = getExpStr();
        Map<String,Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果："+expStr + "=" + calculator.run(var));
    }

    private static Map<String, Integer> getValue(String expStr) throws IOException {
        Map<String, Integer> map = new HashMap<>();
        char[] expChar = expStr.toCharArray();
        for (char c : expChar){
            if (c == '+' || c == '-'){
                continue;
            } else {
                System.out.print("请输入"+c+"的值：");
                String val = new BufferedReader(new InputStreamReader(System.in)).readLine();
                map.put(String.valueOf(c), Integer.valueOf(val));
            }
        }
        return map;
    }

    public static String getExpStr() throws IOException{
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in)).readLine());
    }


}
