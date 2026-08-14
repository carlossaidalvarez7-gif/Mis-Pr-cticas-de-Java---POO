package OOP;

public class ExcercisesBankAccount {
    
    int balance; 

    public ExcercisesBankAccount(int balance){
        this.balance = balance;
     }


    public void deposito(int monto){
        this.balance += monto ;

    }
}
