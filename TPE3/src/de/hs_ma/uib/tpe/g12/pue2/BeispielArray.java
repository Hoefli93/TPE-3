package de.hs_ma.uib.tpe.g12.pue2;

import java.util.HashMap;
import java.util.Map;

public class BeispielArray implements AssociativeArray {

	public static void main(String args[]) {

		Map<String, String> person = new HashMap<String, String>();
		person.put("Vorname", "Hans");
		person.put("Name", "Mustermann");
		person.put("Geburtstag", "01.01.01");
		person.put("Wohnort", "Musterstadt");
		System.out.println(person.get("Name"));

		class Baumknoten {
			private char zeichen;
			private Baumknoten links, rechts;

			public Baumknoten(char z) {
				links = rechts = null;
				zeichen = z;
			}

			public Baumknoten(char z, Baumknoten l, Baumknoten r) {
				links = l;
				rechts = r;
				zeichen = z;
			}

			public char getZeichen() {
				return zeichen;
			}

			public Baumknoten getLinks() {
				return links;
			}

			public Baumknoten getRechts() {
				return rechts;
			}
		}

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public int containsValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int containsKey() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int isEmpty() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void put() {
		// TODO Auto-generated method stub

	}

	@Override
	public void putAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public int remove() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void forEach() {
		// TODO Auto-generated method stub

	}

	@Override
	public void extractAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public void map() {
		// TODO Auto-generated method stub

	}

}