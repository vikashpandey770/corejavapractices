package Custom_Exception;

public class Student {
    public void college(int std) throws StudentCollegeAdmission{
        if(std>=12 && std<13){
            System.out.println("you are a directly addmission in college");
        }
        else if(std>1 && std<=2){
            System.out.println("addmision in 3");
        }
        else if(std>2 && std<=3){
            System.out.println("addmision in 4");
        }
        else if(std>3 && std<=4){
            System.out.println("addmision in 5");
        }
        else if(std>4 && std<=5){
            System.out.println("addmision in 6");
        }
        else if(std>5 && std<=6){
            System.out.println("addmision in 7");
        }
        else if(std>6 && std<=7){
            System.out.println("addmision in 8");
        }
        else if(std>7 && std<=8){
            System.out.println("addmision in 9");
        }
        else if(std>8 && std<=9){
            System.out.println("addmision in 10");
        }
        else if(std>9 && std<=10){
            System.out.println("addmision in 11");
        }
        else if(std>10 && std<=11){
            System.out.println("addmision in 12");
        }

        else {
            throw  new StudentCollegeAdmission("sorry. you are not a qualify for this addmission in college");
        }
    }
}
