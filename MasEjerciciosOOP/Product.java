package MasEjerciciosOOP;

public class Product {
    
    private double price;

    public void setPrice(double price){

        if(price > 0){
            this.price = price;

        }else{
            System.out.println("Precio invalido");
        }
    }

    public double getPrice(){
        return price;
    }
}
