package ru.mirea.task2;

public class Dog {
    String name;
    int dog_age;

    Dog(String t_name, int age){
        name = t_name;
        dog_age = age;
    }

    void setName(String new_name){
        name = new_name;
    }

    String getName(){
        return name;
    }

    void setDog_age(int new_age){
        dog_age = new_age;
    }

    int getDog_age(){
        return dog_age;
    }

    int DogAge_to_HumanAge(int dog_age){
        return dog_age*7;
    }

    public String toString(){
        return "Dog{" +
                "Name = '" + name + '\'' +
                ", age = '" + dog_age + '\'' +
                ", dog's age in human years: " + DogAge_to_HumanAge(dog_age) + '}';
    }
}
