

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=2;
		//System.out.println(num%10);
		System.out.println(num/10);
		while(num!=0) {
			int k =num%10;
			System.out.print(k);
			num=num/10;
		
		}
	}

}
