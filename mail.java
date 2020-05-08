import java.util.Scanner;

public class mail {
    public static void main(String[] args) {
        cat cat = new cat("red");
        dog dog = new dog("blak");

        System.out.println("cat:");
        System.out.println("run: " + cat.run(150));// 200
        System.out.println("swim: " + cat.swim(-10)); // 0
        System.out.println("jump:" + cat.jump(1.5)); //2

        System.out.println("dog:");
        System.out.println("run: " + dog.run(300));//500
        System.out.println("swim: " + dog.swim(10.1));//10
        System.out.println("jump:" + dog.jump(0.4));//0.5

    }
}
