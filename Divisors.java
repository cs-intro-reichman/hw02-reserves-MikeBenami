
public class Divisors {
	public static void main (String[] args) {
             int d = Integer.parseInt(args[0]);
             for( int i = 0; i <= d ; i++){
              if( d % i == 0){
                System.out.println(i);
              }
             }
 	}
}
