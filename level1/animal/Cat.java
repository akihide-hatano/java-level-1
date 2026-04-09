package level1.animal;

public class Cat extends Animal{

    public Cat(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(getName() + " says Meow");
    }

    @Override
    public String getTypeLabel(){
        return "猫";
    }
}

