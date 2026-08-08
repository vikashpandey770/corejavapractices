package CoreJavaPracticeMix;

class  Accou{

    int acc_number;
    String name;
    double amount;

    void insert(int a,String n,double am){
acc_number=a;
name=n;
amount=am;


    }

    void diposite(double am){
        amount=amount+am;
        System.out.println(am+" d");
    }

}


public class BankAcco {
    public static void main(String[] args) {

    }
}
