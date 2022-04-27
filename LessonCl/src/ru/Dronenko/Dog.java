package ru.Dronenko;

public class Dog extends Animal{
    public  void eat (){
        System.out.println("Dog eat!");
    }
    public void bark () { // Лаить
        System.out.println("i am dog, Gav!");
    }

    public void showname () {
        System.out.println(name);
    }
}
