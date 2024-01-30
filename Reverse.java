public class Reverse {
	public static void main(String[] args){
        String str = args[0];
	int i = str.length(str);	
        char m = str.charAt(i/2);
        for(int i; i > 0; i--){
           System.out.print(str.charAt(i));
        }
        System.out.println("The middle character is " + m);
	}
}
