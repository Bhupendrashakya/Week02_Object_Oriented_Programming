package com.tit.day5javainheritence.assistprogram.animal;

class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}