package calcul;
 import java.util.*;
       import java.util.Scanner;
/**
 *
 * @author something
 */
public class Calcul {
    
    public static void main(String[] args) throws Exception {
        
        System.out.println(" Enter arbitrary numbers:");
        Scanner inp= new Scanner(System.in);
        int num1,num2;
        num1=inp.nextInt();
        num2= inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition,2 for  Substraction , 3 for Multiplication  and 4 for Division :");
        int choose;
        choose= inp.nextInt();
        switch (choose) {
            case 1:
                System.out.println(add(num1, num2));              
                break;
            case 2:
                System.out.println(sub(num1, num2));
            case 3:
                System.out.println(mult(num1, num2)); 
            case 4:
                System.out.println(div(num1, num2));
    
    
    break;
            default:
                throw new AssertionError();
        }
    }

   
    public static int add(int x, int y ){
        int result = x + y;
        return result;
    }
    
   public static int sub( int x, int y){
       int result = x - y;
       return result;
   }
   public  static  int mult( int x, int y){
       int result =x*y;
       return result;
   }
   public static int div(int x, int y) throws Exception{
       if ( y==0){
           throw  new Exception(" Division by zero!!!");
       }
       else{
       int result=x/y;
        return result;
       }
      
   }
      
}
   




