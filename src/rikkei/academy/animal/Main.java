package rikkei.academy.animal;

import rikkei.academy.animal.Animal;
import rikkei.academy.animal.Chicken;
import rikkei.academy.animal.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1]=new Chicken();
        for (Animal a : animals) {
            System.out.println(a.makeSound());
        }
    }
}