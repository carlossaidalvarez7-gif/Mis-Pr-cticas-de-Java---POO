package Operadores;


public class Operators {
    public static void main(String[] args) {
    
        int a = 5;
        int b = 3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //asignacion

        a = b;
        System.out.println(a);

        a = b * 2;
        System.out.println(a);

        a += 1; //a = a + 1
        System.out.println(a);

        a -= 1;
        System.out.println(a);

        a *= 1;
        System.out.println(a);
        
        a /= 1;
        System.out.println(a);

        


        //Comparacion (Relacionales)

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);


        //logicos

        //Y (AND)
        System.out.println(3 > 2 && 5 == 4);
        
        // O (OR)
        System.out.println(1 > 2 || 5 == 3);

        //NO (NOT)
        System.out.println(!true);
        
        
        //Unarios

        



    }
   




}
