package level2;

import level1.Main;

public class Runner {
    public static void main(String[] args) {
        System.out.println("=== Runner開始 ===");

        Main a = new Main(777);
        a.show();

        System.out.println("count = " + Main.getCounter());
        System.out.println(a.x);
        System.out.println(a.y);
        System.out.println(a.z);
        System.out.println(a.l);


        System.out.println("=== Runner終了 ===");
    }
}