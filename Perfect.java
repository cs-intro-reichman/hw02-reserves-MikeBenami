/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int number = Integer.parseInt(args[0]);
		int sum = 1;
		String solution = number + " is a perfect number since " + number + " = 1"; 
		for(int i = 2 ; i < number; i++){
			if (number % i == 0) {
				sum = sum + i;
				solution = solution + " + " + i ;
			}
        }
		if(number != sum ){
			solution = number + " is not a perfect number";
		} 
        System.out.println(solution);
	}
}
