package Oops;

interface Rbi{

    float rateOfInterest();
}
class Sbi implements Rbi{
    public float rateOfInterest(){
        System.out.println("sbi bank home loan start a 11.5 %");
return 0;
    }
}
class Hsbc implements Rbi{
    public float rateOfInterest(){
        System.out.println("hsbc bank home laon start a 6 %");
        return  0;
    }
}

class  Canara implements Rbi{
    public float rateOfInterest(){
        System.out.println("canara bank home loan start a 20 %");
        return 0;
    }
}

public class BankInterfaces {
    public static void main(String[] args) {
        System.out.println("----------------Bank interface program using one method like rate of interest -------------------");

        Sbi s=new Sbi();
        s.rateOfInterest();

        Hsbc h=new Hsbc();
        h.rateOfInterest();

        Canara c=new Canara();
        c.rateOfInterest();

    }
}