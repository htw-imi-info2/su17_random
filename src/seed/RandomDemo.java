package seed;
import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		for (int j = 0; j < 10; j++) {
			Random r = new Random(2307824);

			for (int i = 0; i < 6; i++) {
				System.out.print("" + (r.nextInt(6) + 1) + ", ");
			}
			System.out.println();
		}

	}

}
