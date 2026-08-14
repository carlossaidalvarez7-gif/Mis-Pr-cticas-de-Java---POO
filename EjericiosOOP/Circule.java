package EjericiosOOP;

public class Circule extends Shape{

    double radio = 5.0;

    @Override
    public void calculateArea(){

        double area = 3.14159 * radio * radio;
        System.out.println("El area del cicurlo es : " + area);
        

         

    }
    
}
