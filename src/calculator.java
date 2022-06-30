import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans=0;
        System.out.println("Please enter the operation youn want to perform");
        char op=in.next().trim().charAt(0);
        int num1=in.nextInt();
        int num2=in.nextInt();

        if(op=='+'){
            ans=num1+num2;
        }
        if(op=='-'){
            ans=num1-num2;
        }
        if(op=='*'){
            ans=num1*num2;
        }
        if(op=='/'){
            if(num2 != 0){
                ans=num1 % num2;
            }
        }
        else{
            System.out.println("Invalid operator");
        }
        System.out.println(ans);

    }
}
