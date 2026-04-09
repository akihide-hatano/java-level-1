package level1.animal;

public class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(getName() + " says Woof");
    }

    @Override
    public String getTypeLabel(){
        return "犬";
    }
}