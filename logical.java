import java.util.Scanner;

public class logical {
    public static void main(String[] args) {

      // && (AND) , || (OR) , !(P==Q) (NOT EQUAL)

         Scanner sc = new Scanner(System.in);
         int p = sc.nextInt();
         int q = sc.nextInt();
         int k = sc.nextInt();

         
     if ( (p <= q && p <= q && p!=q )  || ( k < p && k >q)) {
            System.out.println("true");

        } else {
            System.out.println("false");
            
        }


    }

}
