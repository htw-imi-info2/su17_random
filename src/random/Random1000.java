package random;

public class Random1000 {
	public static void main(String[] a){
		java.util.Random r = new java.util.Random();
		int count4 = 0, n = 0;
		for (int i=0; i<1000000; i++) {
			//r = new java.util.Random(); // you don't wanna do this...
			n = (int) (r.nextDouble() * 10);
			if (n == 4) count4++;
		}
		System.out.println("4 count "+count4);
	}
}
