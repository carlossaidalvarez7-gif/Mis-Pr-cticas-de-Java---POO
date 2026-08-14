package OOP;

public class ExcercisesStudent {
    
    int score;

    public ExcercisesStudent(int score){

        this.score = score;
    }

    public void veredicto(){
        if(this.score > 60){
            System.out.println("Aprobo");
        }
        else{
            System.out.println("Desaprobo");
        }
 
    }

}
