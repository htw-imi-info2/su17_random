package exercises;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomExercises {
	Random rand = new Random();

	// high and returns a random integer between and including low and high?

	// How do we generate a random number between 0 and n?
	@Test
	public void test() {
		Random rand = new Random();
		int n = 100;
		for (int i = 0; i < 1000; i++)
			assertTrue(rand.nextInt(n) < n);

	}

	// How do we generate a random number r with low <= r < high?
	@Test
	public void testLowHigh() {
		int low = 5;
		int high = 8;
		for (int i = 0; i < 1000; i++) {
			int randomNumber = low + rand.nextInt(high - low);
			assertTrue(low <= randomNumber);
			assertTrue(randomNumber < high);
		}

	}

	// How do we write a method randomInt which takes
	// two int values low and
	@Test
	public void testLowHighMethod() {
		int low = 5;
		int high = 8;
		for (int i = 0; i < 1000; i++) {
			int randomNumber = randomInt(low, high);
			assertTrue(low <= randomNumber);
			assertTrue(randomNumber <= high);
		}

	}

	@Test
	public void testLowHighMethodGetHigh() {
		int low = 0;
		int high = 1;
		long sum = 0;
		int N = 10000;
		for (int i = 0; i < N; i++) {
			int randomNumber = randomInt(low, high);
			sum += randomNumber;
		}
		assertEquals(0.5, ((double) sum / N), 0.03);

	}

	private int randomInt(int low, int high) {
		return low + rand.nextInt(high - low + 1);
	}
	// How can we test that this method really returns uniformly distributed
	// pseudorandom numbers?

	// Histogram, oder wie oben
}
