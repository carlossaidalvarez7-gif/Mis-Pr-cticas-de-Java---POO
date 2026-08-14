package MasEjerciciosOOP;

public class Persona {

    private String name;
    private int age;

    // -- GETTERS (para leer los datos)

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    //-- SETTERS (para guarda o modificar los datos)

    public void setName(String name){
        this.name = name;
    }

    public void setAge (int age){
        this.age = age;
        
    }
    
}