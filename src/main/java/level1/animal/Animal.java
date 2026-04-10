package level1.animal;

public class Animal {

    //自分のnameの継承だけをOKとする
    private final String name;

    //ここで名前は持っていること
    public Animal(String name){
        this.name = name;
    }

    //泣き声はオーバーライドさせていく
    public  void speak(){
        System.out.println("Animal sound");
    }

    public String getTypeLabel(){
        return "動物";
    }

    protected String getName(){
        return name;
    }
}