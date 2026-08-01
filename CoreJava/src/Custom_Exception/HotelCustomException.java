package Custom_Exception;

public class HotelCustomException extends Exception {
    public HotelCustomException(String s){
        System.out.println("----------------- this hotel table limit only 4 person capacity--------------");

    }
}
