package rainlox.data_types;

import java.util.ArrayList;

public class Mission {

	private String name;
	private String target;
	private int _id;
	private int[] rewards;

	public Mission(String name, int _id, int[] rewards) {
		this.name = name;
		this._id = _id;
		this.rewards = rewards;
	}

	public ArrayList<Object> getProperties() {
		ArrayList<Object> properties = new ArrayList<>();
		properties.add(0, name);
		properties.add(1, _id);
		properties.add(2, rewards[0]);
		properties.add(3, rewards[1]);
		return properties;
	}

	public static void main(String[] args) {

	}
}
