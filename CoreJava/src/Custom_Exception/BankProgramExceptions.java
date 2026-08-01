package Custom_Exception;

public class BankProgramExceptions  extends Exception{
    double amount;

    public BankProgramExceptions(double amount){

        this.amount=amount;
    }
    public  double getAmount(){
        return amount;
    }
}
