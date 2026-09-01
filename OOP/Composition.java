package OOP;

public class Composition {

    public static void main(String[] args) {
        
        //composicion ("tiene un")

        var car = new Car();
        car.on();
        


    }

    public static class Engine {

        public void on(){
            System.out.println("Motoe encendido");
        }
    
        
    }

    public static class Car extends Engine {

        final private Engine engine = new Engine(); // para la composicion se debe instanciar

        public void on(){
            engine.on();

        }
    
        
    }
}