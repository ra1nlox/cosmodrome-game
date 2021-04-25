package rainlox.missions;

import java.util.ArrayList;
import java.util.Random;

import rainlox.data_types.Mission;
import rainlox.seed.Seed;

public class Generator {
	private Seed seed;
	private ArrayList<Mission> missions = new ArrayList<>();

	public final String[] DEFAULT_TARGETS = new String[] { "Deploy satellite", "Land rocket", "Launch rocket",
			"Get scientific data", "Land on Mars" };

	public Generator() {
		seed = new Seed();
	}

	public void getMissions() {
		Generator generator = new Generator();

		Mission mission1 = new Mission(DEFAULT_TARGETS[0], 1, new int[] { rndMor(), rndSP() });
		Mission mission2 = new Mission(DEFAULT_TARGETS[1], 2, new int[] { rndMor(), rndSP() });
		Mission mission3 = new Mission(DEFAULT_TARGETS[2], 3, new int[] { rndMor(), rndSP() });
		Mission mission4 = new Mission(DEFAULT_TARGETS[3], 4, new int[] { rndMor(), rndSP() });
		Mission mission5 = new Mission(DEFAULT_TARGETS[4], 5, new int[] { rndMor() * 15, rndSP() * 15 });

		missions.add(mission1);
		missions.add(mission2);
		missions.add(mission3);
		missions.add(mission4);
		missions.add(mission5);

		for (int i = 0; i < 5; i++) {
			System.out.println(missions.get(i).getProperties());
		}
	}

	private int rndMor() {
		int mor = seed.getPosition(new Random().nextInt(3));
		if (mor == 0) {
			mor++;
			mor *= 45;
			return mor;
		} else {
			mor *= 45;
			return mor;
		}
	}

	private int rndSP() {
		int SP = seed.getPosition(new Random().nextInt(4));
		if (SP == 0) {
			SP++;
			SP *= 20;
			return SP;
		} else {
			SP *= 20;
			return SP;
		}
	}

}
