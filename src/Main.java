//AGE PROGRAM

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
         int age =in.nextInt();
         if(age>=18){
             System.out.println("You are a adult");
         }
         else{
             System.out.println("You are not a adult");
         }
    }
}