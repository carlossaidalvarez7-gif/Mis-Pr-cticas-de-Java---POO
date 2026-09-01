package OOP;


public class Abstraction {

    public static void main(String[] args) {
        
        //Abstraccion:
        
        // - Clase abstracta

        var dog1 = new Dog();
        dog1.sleep();
        dog1.sound();

        var cat1 = new Cat();
        cat1.sleep();
        cat1.sound();


        // - Interface

        



    }


    //Clase abstracta


    public static abstract class Animal {

        public abstract void sound();

        public void sleep(){
            System.out.println("El animal esta durmiendo");
        }
    }

    public static class  Dog extends Animal {
        @Override
        public void sleep(){
            System.out.println("El perro esta durmiendo");
        }

        @Override
        public void sound(){
            System.out.println("Guau");
        }
    }
    
    public static class Cat extends Animal {
        @Override 
        public void sound(){
            System.out.println("Miau");
        }         
    }


    public interface  Flying {

        void fly();    
    }

    public static class Bat extends Animal implements Flying {
    
        @Override
        public void sound(){
            System.out.println("Soy baatman");
        }

        @Override
        public void fly(){
            System.out.println("El murcielago vuela");
        }
        
    } 
}
