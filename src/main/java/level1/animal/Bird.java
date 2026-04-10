package level1.animal;

public class Bird extends Animal implements Flyable{

    public Bird(String name){
        super(name);
    }

    @Override
    public void speak(){
        System.out.println(getName() + " says chirps");
    }

    @Override
    public void fly(){
        System.out.println("Bird is flying");
   }

   @Override
   public String getTypeLabel(){
        return "鳥";
    }

}