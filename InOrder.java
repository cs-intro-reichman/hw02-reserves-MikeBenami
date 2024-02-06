public class InOrder{
	public static void main(String[] args) {
		int a = (int)(Math.random()*10);
		System.out.print( a + " ");
		do {
			int b = (int)(Math.random()*10);
			if(b >= a){
				System.out.print(b + " ");
				a = b ;
			} else{
				break;}
		}while(true);	
	}
}
