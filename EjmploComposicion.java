class Main {
    public static void main(String[] args) {

        Vehiculo auto1 = new Vehiculo("Ford", "ABD123", 1.6, "SNEY6DE");
        System.out.println("Marca: " +auto1.getMarca() + "\nPatente:" +auto1.getPatente()+ "\n---Motor---"+"\nCilindrado:" +auto1.getMotor().getCilindrada()+"\nNumero de Serie: " +auto1.getMotor().getNroSerie() );
     
    }

    public static class Motor{

        private double cilindrada;
        private String nroSerie;

        public Motor(double cilindrada,String nroSerie){
            this.cilindrada = cilindrada;
            this.nroSerie = nroSerie;
        }

        public double getCilindrada(){
            return this.cilindrada;
        }

        public String getNroSerie(){
            return this.nroSerie;
        }



    }


    public static class Vehiculo{

        private String marca;
        private String  patente;

        private Motor motor;

        public Vehiculo(String marca,String patente, double cilindrada, String nroSerie){
            this.marca = marca;
            this.patente = patente;

            this.motor = new Motor(cilindrada, nroSerie); //composicion
        }

        public String getMarca(){
            return this.marca;
        }

        public String getPatente(){
            return this.patente;
        }

        public Motor getMotor(){
            return this.motor;
        }

    }

}
