
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
//        Variables


        String name= "Puja";
        int age=23;
        String name1= "Arjun";
        int age1 = 25;

        String name2=name1;
        System.out.println(name + name2 + name1);


//        Primitive types
        byte age2 =30;
        int phone =1234567899;
long phone2 = 123479466934L;
float pi = 3.13F;
char letter = '@';
boolean isAdult = false;

//Non-primitive types

        String name3= "Arjun";
        System.out.println(name3.length());

//        Non-primitive types

        String name6 =new String("Poo");



// Strings
        String naame ="Arjun";
        String naame2 ="Puja";
        String naame3= naame + " and "+ naame2;
        System.out.println(naame3);


//        charAt
        String name8 ="Arjun";
        System.out.println(name8.charAt(1));


//        Length

        System.out.println(name8.length());
//replace
        String name9= name8.replace('A','p');
        System.out.println(name9);

//        substring

        String name10="Arjun and Puja";
        System.out.println(name10.substring(6,10));



//Arrays

        int[] marks =new int[3];
        marks[0]=97;
        marks[1]=98;
        marks[2]=96;
        System.out.println(marks[0]);

//        length
        System.out.println(marks.length);

//        sorting
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);

//2D array
        int[][] finalMarks ={{97,98,96}, {95,99,94}};
        System.out.println(finalMarks[0][0]);


    }
}