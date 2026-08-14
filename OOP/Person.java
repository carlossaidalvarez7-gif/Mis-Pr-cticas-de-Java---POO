package OOP;

public class Person {
    //Esta seria la clase , que es donde definimos
    //las caracteristicas y metodos que va a tener 
    //nuestro objeto

    
    //Atributos = caracteristicas

    protected String name;
    int age;

    //Constructor

    public Person(String name,int age ){
        this.name = name;
        this.age = age;
    }


    //Metodo

    public void sayHello(){
        System.out.println("Hola soy " + name + " y tengo " +age+ " años ");
    }


}
