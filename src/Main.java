import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

         if ((num%2==0) && (num%5==0)) {
            System.out.println("FizzBuzz");
        }else if(num%2==0){
             System.out.println("Fizz");
         } else if (num%5==0) {
             System.out.println("Buzz");
         }
         sc.close();

    }
}
