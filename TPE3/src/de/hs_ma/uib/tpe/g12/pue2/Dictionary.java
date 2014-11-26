package de.hs_ma.uib.tpe.g12.pue2;

public class Dictionary extends Baum<String, String> {

	public Dictionary(String key, String value) {
		super(key, value);
	}

	public String[] keys() {

		String[] keys = new String[size()];

		keys(keys, this.wurzel, 0);

		return keys;
	}

	public void keys(String[] keys, Baumknoten node, int zaehler) {
		if (node != null) {
			keys[zaehler] = "" + node.getKey();
			if (node.getLinks() != null) {
				keys(keys, node.getLinks(), ++zaehler);
			}
			if (node.getRechts() != null) {
				keys(keys, node.getRechts(), ++zaehler);
			}
		}
	}

	public String[] values() {
		String[] values = new String[(int) this.size()];
		values(values, this.wurzel, 0);
		return values;
	}

	public void values(String[] values, Baumknoten node, int zaehler) {
		if (node != null) {
			values[zaehler] = "" + node.getValue();
			if (node.getLinks() != null) {
				values(values, node.getLinks(), ++zaehler);
			}
			if (node.getRechts() != null) {
				values(values, node.getRechts(), ++zaehler);
			}
		}
	}
}