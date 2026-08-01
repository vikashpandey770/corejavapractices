package Custom_Exception;

public class AccountDatas {
    int accNo;
    String name;
    double balance;

    public AccountDatas(int accNo,String name,double balance) {
        this.accNo = accNo;
        this.name = name;
        this.balance = balance;
        System.out.println("hello , " + name + " your account open with " + balance + " Rs.");
    }
    void diposite(double amount){
        this.balance+=amount;
    }
    void withdraw(double amount) throws BankProgramExceptions{
        if(amount<=this.balance){
           this.balance-=amount;
        }
        else {
            throw new BankProgramExceptions(amount-this.balance);
        }
    }

    void checkBalance(){
        System.out.println("current balance:"+this.balance);
    }

    }

