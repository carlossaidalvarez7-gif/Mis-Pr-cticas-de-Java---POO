package OOP;

public class Polymorphims{

    public static void main(String[] args) {
        
        // Polimorfismo : basicamente es una misma metodo que reacciona de forma distinta según el contexto o el objeto.
        // Poli: muchas morfismo :formas 


        // -Polimorfimso por herencia (Sobreescritura)
        var animal1 = new Animal();
        animal1.sound();

        var dog1 = new Dog();
        dog1.sound();


        // - Polimorfismo por sobrecarga ( sobrecarga de metodos): 
        var calculator1 = new Calculator();
        System.out.println(calculator1.sum(1, 2));
        System.out.println(calculator1.sum(2.5, 3.5));

    }
    
    // -Polimorfimso por herencia (Sobreescritura)

    public static class Animal {
        public void sound(){
            System.out.println("Algun sonido");
        }
        
    }

    public static class Dog extends Animal{
        @Override
        public void sound(){
            System.out.println("Guau");
        }
    }
    
    // - Polimorfismo por sobrecarga (sobrecarga de metodos)
    public static class Calculator {

        public int sum(int a , int b){
            return a + b;
        }

        public double sum(double a, double b){
            return a + b; 
        }

        public double sum(double a, double b, double c){
            return a + b + c; 
        }
    
        
    }
}