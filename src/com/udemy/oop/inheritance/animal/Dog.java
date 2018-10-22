package com.udemy.oop.inheritance.animal;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        super(name,1, 1, size, weight);

        //only related to the dog
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //only related to the dog class
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        //we added our method from sub class
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
}
