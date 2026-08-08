package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparatorsprogram  implements Comparator<Emp> {

    @Override
    public int compare(Emp e1, Emp e2) {

        int value = 0;

        if(e1.getSalary()> e2.getSalary()){
            value =-1;
        }
        else if(e1.getSalary()<e2.getSalary()){
            value =1;
        }
        else if(e1.getSalary()== e2.getSalary()){
            value =0;
        }
        return value ;

    }
    public static void main(String[] args) {
        ArrayList <Emp> list=new ArrayList<>();

        Emp e1=new Emp();
        e1.setId(1);
        e1.setName("vikash");
        e1.setSalary(35000);

        Emp e2=new Emp();
        e2.setId(2);
        e2.setName("karan");
        e2.setSalary(30000);

        Emp e3=new Emp();
        e3.setId(3);
        e3.setName("nimesh");
        e3.setSalary(30000);

        Emp e4=new Emp();
        e4.setId(6);
        e4.setName("nimeshsfs");
        e4.setSalary(10000);

        list.add(e1);
list.add(e2);
list.add(e3);
list.add(e4);

        Collections.sort(list,new Comparatorsprogram());
for(Emp e:list){

    System.out.println("your id is:"+e.getId()+"and name is :"+e.getName()+" and salary is : "+e.getSalary());
}
    }
}
