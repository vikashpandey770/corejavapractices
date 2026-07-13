public class Array7 {
    public static void main(String[] args) {

        String name[]={"car","bike","activa","mom"};

        for(String car: name){
            System.out.println(car);
            System.out.println(car.length());
        }

        for(int i=0;i<name.length;i++){
            System.out.println("car numbers:"+i+" is name by:"+name[i]);
        }

    }
}
