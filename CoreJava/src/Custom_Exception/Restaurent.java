package Custom_Exception;

public class Restaurent {
    public void minimumOrder(int price) throws RestaurentCustomExce{
        if(price >=500){
            System.out.println("your order is conform");
        }
        else {
            throw new RestaurentCustomExce("sorry order value increse kro.");
        }
    }
}
