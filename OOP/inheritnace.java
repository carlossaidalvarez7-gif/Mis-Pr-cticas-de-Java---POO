package OOP;

import OOP.inheritnace.Animal;

public class inheritnace {
    
    public static void main(String[] args) {
        
        var animal1 = new Animal();
        animal1.name = "poli";
        animal1.eat();
    
        var dog1 = new Dog();
        dog1.name = "tobi";
        dog1.eat();
    

        var bird1 = new Bird();
        bird1.name = "Richard";
        bird1.eat();
        bird1.fly();

        
    }

    //herencia 
    public static class Animal{

        String name;

        public void eat(){
            System.out.println("El animal llamado " + name + " esta comiendo");
        }

    }

    public static class Dog extends Animal{

        
    }

    public static class Cat extends Animal{

    }

    public static class Bird extends Animal{
        
        public void fly(){
            System.out.println("Esta volando");
        }

    }
}
