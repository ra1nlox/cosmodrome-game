package rainlox.seed;

import java.util.concurrent.ThreadLocalRandom;

public class Seed {

	private Integer weed;

	public final int MIN_INDEX = 0;
	public final int MAX_INDEX = 7;

	public Seed() {
		weed = ThreadLocalRandom.current().nextInt(100000000);
	}

	public int getPosition(int pos) throws IllegalArgumentException {
		if (pos <= 7) {
			String toArray = weed.toString();
			String[] toReturn = toArray.split("");

			return Integer.parseInt(toReturn[pos]);
		} else {
			throw new IllegalArgumentException("Argument number is bigger than 7");
		}
	}

	public String getPositionFromTo(int pos1, int pos2) throws IllegalArgumentException {
		if (pos1 <= 7 & pos2 <= 7) {
			String toReturn = "";

			if (pos1 != pos2) {

				String toArray = weed.toString();
				String[] arrayWeed = toArray.split("");

				for (int i = pos1; i <= pos2; i++) {
					toReturn += arrayWeed[i];
				}

				return toReturn;
			} else {
				throw new IllegalArgumentException("The argument pos1 must not match pos2");
			}
		} else {
			throw new IllegalArgumentException("Arguments is out of bounds");
		}
	}
}
