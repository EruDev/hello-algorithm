package me.erudev.ch01._0004;

/**
 * @author pengfei.zhao
 * @date 2020/12/5 16:42
 */
public class Pet {
    private String type;

    public Pet(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

class Dog extends Pet{

    public Dog(String type) {
        super("dog");
    }
}
class Cat extends Pet{

    public Cat(String type) {
        super("cat");
    }
}
