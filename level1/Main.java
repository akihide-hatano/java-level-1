package level1;

public class Main{

    //フィールドにて定義
    public int x = 10; //公開
    int y = 20; //同パッケージのみに公開
    private int z = 30; //自分のclassのみ
    protected int l = 40;
    private static int count = 0;

    //staticブロックを生成
    static{
        System.out.println("1.staticブロック");
        count = 100;
    }

    //インスタンスブロック 
    {
        System.out.println("② インスタンスブロック");
        count++;
    }

    //コンストラクタ呼ぶたびに実行される。
    //nameをすることでnewしたvalueをxとして与えることができる。
    public Main( int value){
        System.out.println("③ コンストラクタ");
        this.x = value;
    }

    public void show(){
        System.out.println("④ show()");
        System.out.println("   x = " + x);
        System.out.println("   y = " + y);
        System.out.println("   z = " + z);
        System.out.println("   l = " + l);
        System.out.println("   count = " + count);
    }

    public static int getCounter(){
        return count;
    }

    public static void main(String[] args) {
        System.out.println("=== main開始 ===");

        Main a = new Main(20);
        a.show();


        Main b = new Main(90);
        b.show();

        System.out.println(Main.getCounter());
         System.out.println("=== main終了 ===");
    }
}