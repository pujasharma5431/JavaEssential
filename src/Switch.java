import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int day = 1;

         switch(day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("Saturday");
        }
    }
}
