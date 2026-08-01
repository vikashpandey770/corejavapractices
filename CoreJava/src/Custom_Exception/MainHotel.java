package Custom_Exception;

import java.util.Scanner;

public class MainHotel {

    public static void main(String[] args) throws HotelCustomException {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many number of person : ");
        int person=sc.nextInt();

        Hotel h=new Hotel();

try {
    h.bookTab(person);
}catch (HotelCustomException r){
    System.out.println("Custom exception provide: ");
}


finally {
    System.out.println("ok done , visit again");
}
    }
}
