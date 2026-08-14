package MasEjerciciosOOP;

public class Temperature {

    private double celcius;

    public void setCelcius(double celcius){
        if ( celcius <= 100 && celcius >= -100){
                this.celcius = celcius;
        }else{
            System.out.println(("Temperatura no valida"));
        }
    }

    public double getCelcius(){
        return this.celcius;
    }

    
}
