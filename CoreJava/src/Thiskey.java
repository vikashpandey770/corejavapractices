public class Thiskey {

    int modelyear;
    String carname;
    int x;
    Thiskey(int x){
        this.x=x;
    }
    Thiskey(int m,String c){
        modelyear=m;
        carname=c;
    }

    void print(){
        System.out.println(modelyear+" "+carname);
    }
    public static void main(String[] args) {
        Thiskey t=new Thiskey(10);
        System.out.println("para meter constructor using this keyword: "+t.x);

        Thiskey tr=new Thiskey(2020,"fronx");
        Thiskey trr=new Thiskey(1656,"safari");
tr.print();
trr.print();

    }
}
