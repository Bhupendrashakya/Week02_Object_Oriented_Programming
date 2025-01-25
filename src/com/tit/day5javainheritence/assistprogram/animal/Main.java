package com.tit.day5javainheritence.assistprogram.animal;


public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Buddy", 3),
                new Cat("Whiskers", 2),
                new Birds("Tweety", 1)
        };

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " (" + animal.getAge() + " years old) says:");
            animal.makeSound();
        }
    }
}
