package level1.animal;

public abstract class AbstractAnimal {

    protected String name;

    public AbstractAnimal(String name){
        this.name = name;
    }

    public abstract void speak();//実装なし
}