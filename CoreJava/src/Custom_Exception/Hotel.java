package Custom_Exception;

public class Hotel {

    public void bookTab(int person) throws HotelCustomException{
        if(person>4){
            throw new HotelCustomException("this is a over limit . only maximum 4 peple table allow");
        }
        else {
            System.out.println("ok your table is booked");
        }
    }
}
