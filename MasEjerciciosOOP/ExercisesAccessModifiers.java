package MasEjerciciosOOP;

public class ExercisesAccessModifiers {

    public static void main(String [] args){

        Persona person1 = new Persona();

        person1.setName("charly");
        person1.setAge(21);

        System.out.println("Nombre:"+ person1.getAge());
        System.out.println("Edad:"+ person1.getAge());


        var producto1 = new Product();

        producto1.setPrice(1.1);
        System.err.println("Price Product:" + producto1.getPrice());


        var book1 = new Book("Pinocho");

        System.out.println(("Titulo del Libro:"+ book1.getTitule()));
    
        var temperature1 = new Temperature();

        temperature1.setCelcius(-200.5);
        System.out.println("La temperatura es de:" + temperature1.getCelcius());

        var user1 = new User();

        user1.setUsername("Carlos Said Alvarez");
        user1.setPassword("CharlyKatana");

        // --- AHORA PROBAMOS EL LOGIN ---
        
        // 1. Simulamos que alguien pone mal la clave
        System.out.println("Intento 1:");
        user1.checkPassword("123456"); 
        
        // 2. Simulamos que ponés la clave correcta
        System.out.println("Intento 2:");
        user1.checkPassword("CharlyKatana");
    
    
    }
}