
import java.util.Arrays;
import java.util.Scanner;

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
        System.out.println(finalMarks[1][1]);

//        Casting
        int price = 100;
        double finalprice = price + 18.00;
        System.out.println(finalprice);

//        Expliciting Casting

        int p =100;
        int fp =p + (int)19.12;
        System.out.println(fp);


//        Constants

        final float PI = 3.14F;

//        Operators

         // Arithmetic
        int a =1;
        int b=3;
        int sum=a+b;
        int dif=a-b;
        System.out.println(sum);
        System.out.println(dif);


        double a1 =1;
        double b2=3;
        double multi=a*b;
       double div=a1%b2;
        System.out.println(multi);
        System.out.println(div);

        int numb=1;
        System.out.println(numb--);

//        Math Class

        System.out.println((int)(Math.random()*100));
//
////How to take INPUT?
//        Error while print ask

        Scanner sc= new Scanner(System.in);
        System.out.println("Input Your Age?");
        float agee= sc.nextFloat();
        System.out.println(agee);



        System.out.println("Enter your full name");
        String Fname= sc.nextLine();
        System.out.println(Fname);
        System.out.println("Enter a sentence");
        String sent= sc.nextLine();
        System.out.println(sent);

//Cconditional stt
      boolean isSunUp= true;
      if(isSunUp==true)
          System.out.println("It's a Day");
      else
          System.out.println("It's a Night");

int Age= 18;
        if(Age>=18)
            System.out.println("You can Vote");
        else
            System.out.println("You cannot Vote");


//        Logical Operators

    int aa= 20;
    int bb=30;
    if( aa<50 && bb<50)
        System.out.println("Bothh are less than 50");
if(aa<50 || bb>50)
    System.out.println("At least is one less than 50");


boolean isAdult1= true;
if(isAdult1== true)
    System.out.println("Is adult");
else
    System.out.println("Is Not adult");



Scanner sc3= new Scanner(System.in);
int cash= sc3.nextInt();
if(cash>5000){
    System.out.println("Rich");
    System.out.println("I Have cash");
}
else{
    System.out.println("Not rich");
}
















    }
}