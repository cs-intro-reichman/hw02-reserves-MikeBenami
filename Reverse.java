public class Reverse {
	public static void main(String[] args){
        String str = args[0];
	    int i = str.length()-1;	
        int m = i/2 ; 
        for(; i >= 0; i--){
           System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println("The middle character is " + str.charAt(m));
	}
}
