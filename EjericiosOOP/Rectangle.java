package EjericiosOOP;

public class Rectangle extends Shape{

    double base = 4.0;
    double altura = 5.0;
        
    @Override
    public void calculateArea(){

        double area = base * altura;
        System.out.println("El area del rectangulo es de: " + area);

    }
    
}
