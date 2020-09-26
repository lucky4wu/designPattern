package structural.composite;

public class Client {

    public static void main(String[] args) {
        University university = new University("清华大学","top university");

        College college = new College("计算机学院","计算机学院");
        College college1 = new College("信息工程学院","信息工程学院");

        college.add(new Department("软件工程", "软件工程3"));
        college.add(new Department("网络", "网络2"));
        college.add(new Department("计算机科学与技术", "计算机科学与技术11"));

        college1.add(new Department("通信工程", "通信工程5"));
        college1.add(new Department("信息工程", "信息工程523"));

        university.add(college);
        university.add(college1);

        university.print();
    }
}
