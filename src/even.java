import java.util.Scanner;

public class even {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Please enter a number:" );
        int n=in.nextInt();
        for (int i = 1; i <n ; i++) {
            if(i%2==0){
                System.out.println(i);
            }

        }
    }
}
