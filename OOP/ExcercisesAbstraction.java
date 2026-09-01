package OOP;

public class ExcercisesAbstraction {

    public static void main(String[] args) {


        var word1 = new WordDocument();
        word1.print();

        var pdf1 = new PDFDocument();
        pdf1.print();
        
    }

    public static abstract class Document {
        public void print(){
        }
    }

    public static class PDFDocument extends Document{

        @Override
        public void print(){
            System.out.println("Imprimiendo documento PDF");
        }        
    }

    public static class WordDocument extends Document{
        
        @Override
        public void print(){
            System.out.println("Imprimiendo documento Word");
        }
        
    }
}