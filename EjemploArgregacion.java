class Main {
    public static void main(String[] args) {
        Notebook notebook1 = new Notebook("Lenovo"," i7");

        Mouse mouse1 = new Mouse("Logitech", 32000);
        notebook1.conectarMouse(mouse1);
        System.out.println("El mouse es de marca: "+mouse1.getMarca());
        System.out.println("\nTiene un dpi: " +mouse1.getDpi());

    }



    public static class Notebook{

        private String  marca;
        private String procesador;

        private Mouse mouseConectado; //aca esta la agregacion 


        public Notebook(String  marca,String procesador ){
            this.marca = marca;
            this.procesador = procesador;
        }

        public String getMarca(){
            return this.marca;
        }

        public String getProcesador(){
            return this.procesador;
        }

        public void conectarMouse(Mouse mouse){
            this.mouseConectado = mouse;
        }


    }


    public static class Mouse{
        private String marca;
        private double dpi;

        public Mouse(String marca,double dpi ){
            this.marca = marca;
            this.dpi = dpi;
        }


        public String getMarca(){
            return this.marca;
        }

        public double getDpi(){
            return this.dpi;
        }
    }
}
