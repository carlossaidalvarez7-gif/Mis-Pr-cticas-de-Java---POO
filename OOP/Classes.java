package OOP;

public class Classes {

    public static void main(String[] args) {
        
        var person = new Person("Charly", 21); //instanciamos y usamos el constructor

        /*person.name = "Charly";
        person.age = 21;
        */

        person.sayHello(); //usamos el comportamiento

        person.name = "Said";
        System.out.println(person.name);


        var person2 = new Person("Said", 21);

        person2.sayHello();

        // activity 1
        var book1 = new ExercisesBook("Esperando la Carroza:", " Julio Cortaza");

        System.out.println(book1.titule + book1.autor);
        

        //activity 2

        var dog1 = new ExercisesDog();
        dog1.bark();


        //activity 3

        var student1 = new ExcercisesStudent(70);
        
        student1.veredicto();

        //activity 4

        var BankAccount1 = new ExcercisesBankAccount(1500);

        BankAccount1.deposito(2000);
        System.out.println(BankAccount1.balance);




        

    }
}


