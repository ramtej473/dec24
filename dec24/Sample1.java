package dec24;

public class Sample1 {

	public static void main(String[] args) {
		
		int c=17,res=0,p=1;
		for(int i=1;i<=300;i++) {
			if(checkPrime(i) == true) {
				System.out.print(i+" ");
				//c++;
				if(c--==0) {
					
					res = i;
				}
			}
			}
		System.out.println("\n17th Prime no----->"+res);

	}

	private static boolean checkPrime(int num) {
		
		
		int count=0,r;
		for(int i=1;i<=num;i++) {
			r = num % i;;
			if(r==0) count++;
		}
		if(count ==2) return true;
		return false;
	}
}
