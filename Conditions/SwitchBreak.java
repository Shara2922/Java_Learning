package Conditions;

public class SwitchBreak{
    public static void main(String[] args) {
        String day = "tuesday";
        switch(day){
        case "monday":
            System.out.println("cooking");
        case "tuesday":
            System.out.println("end early");
        default:
            System.out.println("wrong day");
        }
    } 

}